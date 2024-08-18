package com.incognito.api.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConversationMapper {

  @Select("SELECT * FROM conversation")
//  @Select("SELECT * FROM conversation WHERE user_id = #{userId}")
  List<Conversation> getAll(@Param("userId") long userId);

  class Conversation {
    public long user_id;
  }
}