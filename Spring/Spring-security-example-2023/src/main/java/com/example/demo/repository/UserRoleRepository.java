package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.UserRole;

public interface UserRoleRepository extends Repository<UserRole, Long> {
	List<UserRole> findByAppUser(AppUser appUser);
}
