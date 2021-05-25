package com.alexkozyura.tutorial.maven.web_app.controllers;

import com.alexkozyura.tutorial.maven.entities.User;
import com.alexkozyura.tutorial.maven.jaxb.model.UserCommand;

public class UserController {

    User saveUser(UserCommand command) {
        return new User();
    }
}
