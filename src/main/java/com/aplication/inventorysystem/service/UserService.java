package com.aplication.inventorysystem.service;

import com.aplication.inventorysystem.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
