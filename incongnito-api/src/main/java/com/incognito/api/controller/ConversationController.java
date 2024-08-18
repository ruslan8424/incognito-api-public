package com.incognito.api.controller;

import com.incognito.api.dao.ConversationDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConversationController {
    private final ConversationDao conversationDao;

    public ConversationController(ConversationDao conversationDao) {
        this.conversationDao = conversationDao;
    }

    @GetMapping("/conversations")
    List<Long> all() {
        return conversationDao.getAll();
    }
}
