package com.stylemyoccasion.service;

import com.stylemyoccasion.model.User;
import com.stylemyoccasion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User signup(User request) {
        return userRepository.save(request);
    }

    public User login(User request) {
        return userRepository.findByEmail(request.getEmail());
    }

    public List<User> signupDetails() {
        return userRepository.findAll();
    }
}
