package me.dio.bootcamp_bradesco.repository;

import me.dio.bootcamp_bradesco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
