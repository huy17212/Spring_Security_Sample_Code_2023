package com.example.demo.repository;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.AppUser;

public interface AppUserRepository extends Repository<AppUser, Long> {
	AppUser findByUserName(String username);
}
