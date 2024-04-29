package org.example.bean;

import org.example.infra.Mapper;

@Mapper
public interface UserMapper {

    String sayHello(String userName);

    String sayHi(String userName);
}
