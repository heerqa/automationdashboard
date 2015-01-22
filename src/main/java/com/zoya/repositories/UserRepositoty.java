package com.zoya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoya.model.User;
public interface UserRepositoty extends JpaRepository<User, Integer> {

}
