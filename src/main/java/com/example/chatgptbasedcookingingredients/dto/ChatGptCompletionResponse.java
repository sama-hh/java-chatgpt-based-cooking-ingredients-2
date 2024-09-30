package com.example.chatgptbasedcookingingredients.dto;

import java.util.List;

public record ChatGptCompletionResponse(List<ChatGptChoice> choices) {}
