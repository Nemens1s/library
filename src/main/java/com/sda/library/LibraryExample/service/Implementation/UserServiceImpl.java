package com.sda.library.LibraryExample.service.Implementation;

import com.sda.library.LibraryExample.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public String userRegistration() {
        return "User registered successfully!";
    }

    @Override
    public String login() {
       return "Logged in successfully!";
    }
}
