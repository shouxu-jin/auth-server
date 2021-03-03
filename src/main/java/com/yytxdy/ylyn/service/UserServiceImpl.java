package com.yytxdy.ylyn.service;

import com.yytxdy.ylyn.model.User;
import com.yytxdy.ylyn.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User get(String username) {
        Optional<User> user = userRepository.findById(username);
        if (null == user.get()) {
            throw new UsernameNotFoundException(username);
        }
        return user.get();
    }
}
