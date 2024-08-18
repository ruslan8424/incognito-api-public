package com.incognito.api.dao;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConversationDao {
    private final ConversationMapper conversationMapper;

    public ConversationDao(ConversationMapper conversationMapper) {
        this.conversationMapper = conversationMapper;
    }

    public List<Long> getAll() {
        var res = conversationMapper.getAll(1);
        return res.stream().map(c -> c.user_id).toList();
    }
}
