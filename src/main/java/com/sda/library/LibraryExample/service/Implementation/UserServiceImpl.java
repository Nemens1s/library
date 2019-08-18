package com.sda.library.LibraryExample.service.Implementation;

import com.sda.library.LibraryExample.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void userRegistration() {
        System.out.println("User registered successfully!");
    }

    @Override
    public void login() {
        System.out.println("Logged in successfully!");
    }
}
