package io.brunohprada.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.brunohprada.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
