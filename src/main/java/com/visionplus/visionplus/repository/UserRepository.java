package com.visionplus.visionplus.repository;

import com.visionplus.visionplus.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select username from user where username = :userName", nativeQuery = true)
    String findByUserName(String userName);
}
