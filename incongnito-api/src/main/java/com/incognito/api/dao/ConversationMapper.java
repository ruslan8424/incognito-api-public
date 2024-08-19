package com.incognito.api.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConversationMapper {

    @Select("SELECT * FROM conversation")
    List<Conversation> getAll(@Param("userId") long userId);

    @Insert("INSERT INTO conversation VALUES (${id}, #{userId})")
    void create(@Param("id") long id, @Param("userId") long userId);

    class Conversation {
        public long id;
        public long user_id;
    }
}