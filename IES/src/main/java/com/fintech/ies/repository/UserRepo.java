package com.fintech.ies.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintech.ies.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Id>{

	UserEntity findByEmail(String email);

	UserEntity findById(Integer id);

}
