package com.codewithRuvi.Fullstackbackend.repository;

import com.codewithRuvi.Fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
