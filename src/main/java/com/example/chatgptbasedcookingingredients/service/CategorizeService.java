package com.example.chatgptbasedcookingingredients.service;


import com.example.chatgptbasedcookingingredients.client.ChatGptApiClient;
import com.example.chatgptbasedcookingingredients.dto.ChatGptCompletionRequest;
import com.example.chatgptbasedcookingingredients.dto.ChatGptCompletionResponse;
import com.example.chatgptbasedcookingingredients.dto.ChatGptMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorizeService {
    private final ChatGptApiClient chatGptApiClient;

    public String categorize(String ingredient) {
        String messageContent = "Answer in one word if this ingredient vegan, vegetarian or regular? The ingredient: " + ingredient;
        ChatGptCompletionResponse response = chatGptApiClient.complete(
                new ChatGptCompletionRequest(
                        "gpt-4o-mini",
                        List.of(new ChatGptMessage("user", messageContent))
                )
        );
        return response.choices().getFirst().message().content();
    }
}
