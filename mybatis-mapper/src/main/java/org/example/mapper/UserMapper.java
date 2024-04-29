package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUser();

    @Select("SELECT * FROM orm_user")
    List<User> listUser();
}

