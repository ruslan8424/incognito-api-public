package com.incognito.api.dao;

import com.incognito.api.service.model.Conversation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ConversationMapper {

    List<Conversation> getAll(@Param("userId") long userId);

    @Insert("INSERT INTO conversation VALUES (${id}, #{userId})")
    void create(@Param("id") long id, @Param("userId") long userId);
}
