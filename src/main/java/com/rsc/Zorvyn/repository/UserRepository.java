package com.rsc.Zorvyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rsc.Zorvyn.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}