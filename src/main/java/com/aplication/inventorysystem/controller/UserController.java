package com.aplication.inventorysystem.controller;

import com.aplication.inventorysystem.model.Users;
import com.aplication.inventorysystem.service.UserService;
import com.aplication.inventorysystem.utils.MapUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Users users) {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", userService.save(users)));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return HandleResponse.buildProductResponse(MapUtils.buildMap("data", userService.getAll()));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Users productDto) {
        userService.update(productDto);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestParam Long id) {
        userService.delete(id);
        return HandleResponse.buildProductResponse(MapUtils.buildEmptyMap());
    }

}
