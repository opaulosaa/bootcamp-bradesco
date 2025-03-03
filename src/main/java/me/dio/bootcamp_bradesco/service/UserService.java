package me.dio.bootcamp_bradesco.service;

import me.dio.bootcamp_bradesco.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
