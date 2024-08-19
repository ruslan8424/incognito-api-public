package com.incognito.api.controller;

import com.incognito.api.service.ConversationService;
import com.incognito.api.service.model.Conversation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConversationController {
    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @GetMapping("/conversations")
    List<Conversation> all() {
        return conversationService.getAll();
    }

    @PostMapping("/conversations")
    CreateConversationApiModel create(@RequestBody CreateConversationApiModel input) {
        conversationService.create(
                input.number(),
                input.message()
        );
        return new CreateConversationApiModel(input);
    }
}
