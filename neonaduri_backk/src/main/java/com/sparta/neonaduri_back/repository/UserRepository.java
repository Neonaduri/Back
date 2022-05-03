package com.sparta.neonaduri_back.repository;


import com.sparta.neonaduri_back.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String userName);

    Optional<User> findByNickName(String nickName);

}