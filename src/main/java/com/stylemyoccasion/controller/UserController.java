package com.stylemyoccasion.controller;

import com.stylemyoccasion.model.User;
import com.stylemyoccasion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User request) {
        User response = userService.signup(request);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/signup")
    public ResponseEntity<List<User>> signupDetails() {
        List<User> response = userService.signupDetails();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User request) {
        User response = userService.login(request);
        return ResponseEntity.ok(response);
    }


}
