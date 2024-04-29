package org.example.api.health;

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping
    public String getUser() {
        User user = userService.getUser();
        return "hello, i am " + user.getName();
    }

    @RequestMapping("/allUser")
    public List<User> listUsers() {
        return userService.listUsers();
    }
}
