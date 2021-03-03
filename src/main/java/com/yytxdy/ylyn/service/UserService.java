package com.yytxdy.ylyn.service;

import com.yytxdy.ylyn.model.User;

public interface UserService {
    void save(User user);

    User get(String username);
}
