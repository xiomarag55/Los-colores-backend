package com.aplication.inventorysystem.service;

import com.aplication.inventorysystem.model.Users;

import java.util.List;

public interface UserService {
    Users save(Users users);

    List<Users> getAll();

    void update(Users product);

    void delete(Long id);
}
