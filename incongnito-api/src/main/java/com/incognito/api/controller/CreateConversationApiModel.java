package com.incognito.api.controller;

public record CreateConversationApiModel(
        int number,
        String message
) {
    public CreateConversationApiModel(CreateConversationApiModel input) {
        this(input.number, input.message);
    }
}
