package com.sparta.neonaduri_back.login.repository;

import com.sparta.neonaduri_back.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String userName);

}