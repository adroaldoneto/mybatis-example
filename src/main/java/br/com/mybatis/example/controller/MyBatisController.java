package br.com.mybatis.example.controller;

import br.com.mybatis.example.model.User;
import br.com.mybatis.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

    private final UserService userService;

    public MyBatisController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user) {
        userService.crateUser(user);
    }
}
