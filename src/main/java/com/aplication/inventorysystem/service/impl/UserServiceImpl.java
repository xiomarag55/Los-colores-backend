package com.aplication.inventorysystem.service.impl;

import com.aplication.inventorysystem.model.Users;
import com.aplication.inventorysystem.repository.UserRepository;
import com.aplication.inventorysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }

    @Override
    public List<Users> getAll() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public void update(Users users) {
        userRepository.save(users);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
