package root.service.impl;

import root.domain.model.User;
import root.service.UserService;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    public User createNewUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        return user;
    }
}
