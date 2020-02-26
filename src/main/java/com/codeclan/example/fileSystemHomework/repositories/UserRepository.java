package com.codeclan.example.fileSystemHomework.repositories;

import com.codeclan.example.fileSystemHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
