package com.vxgm.loginregistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vxgm.loginregistration.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<User> findByUser(String user);
}
