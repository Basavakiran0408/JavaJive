package com.learnsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnsphere.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

	boolean existsByEmail(String email);

	Users findByEmail(String email);





	


}
