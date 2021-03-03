package com.yytxdy.ylyn.controller;

import com.yytxdy.ylyn.model.User;
import com.yytxdy.ylyn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;
    @RequestMapping("/user/add")
    public Object add(@RequestParam String username,@RequestParam String password) {
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(encodedPassword);
        userService.save(user);
        return ResponseEntity.ok("用户添加成功");
    }
}
