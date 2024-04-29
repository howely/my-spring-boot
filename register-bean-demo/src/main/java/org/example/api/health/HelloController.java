package org.example.api.health;

import jakarta.annotation.Resource;
import org.example.bean.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String userName) {
        return userMapper.sayHello(userName);
    }

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String userName) {
        return userMapper.sayHi(userName);
    }
}
