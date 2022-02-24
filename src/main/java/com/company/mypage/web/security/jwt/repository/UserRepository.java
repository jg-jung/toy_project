package com.company.mypage.web.security.jwt.repository;

import com.company.mypage.web.security.jwt.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
