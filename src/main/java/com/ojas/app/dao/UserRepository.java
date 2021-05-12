package com.ojas.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.app.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
User findByUsername(String username);
}
