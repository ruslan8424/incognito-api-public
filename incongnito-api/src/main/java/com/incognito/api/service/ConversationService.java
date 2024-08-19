package com.incognito.api.service;

import com.incognito.api.dao.ConversationDao;
import com.incognito.api.service.model.Conversation;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ConversationService {
    private final ConversationDao conversationDao;

    public ConversationService(ConversationDao conversationDao) {
        this.conversationDao = conversationDao;
    }

    public List<Conversation> getAll() {
        return conversationDao.getAll();
    }

    @Transactional
    public void createTwo() {
        conversationDao.create(1L, 2L);
        conversationDao.create(2L, 3L);
    }

    public void create(int number, String message) {

    }
}
