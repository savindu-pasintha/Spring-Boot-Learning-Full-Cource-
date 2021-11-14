package com.Security.JWT.repo;

import com.Security.JWT.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findAllByUsername(String username);
}
