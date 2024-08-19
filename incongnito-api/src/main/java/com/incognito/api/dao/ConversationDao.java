package com.incognito.api.dao;

import com.incognito.api.service.model.Conversation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConversationDao {
    private final ConversationMapper conversationMapper;

    public ConversationDao(ConversationMapper conversationMapper) {
        this.conversationMapper = conversationMapper;
    }

    public List<Conversation> getAll() {
        return conversationMapper.getAll(1);
    }

    public void create(Long id, Long userId) {
        conversationMapper.create(id, userId);
    }
}
