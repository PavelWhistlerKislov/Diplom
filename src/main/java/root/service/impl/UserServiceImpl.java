package root.service.impl;

import root.domain.model.User;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    public User createNewUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        return user;
    }
}
