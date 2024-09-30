package com.example.chatgptbasedcookingingredients.dto;

import java.util.List;

public record ChatGptCompletionRequest(String model, List<ChatGptMessage> messages) {}
