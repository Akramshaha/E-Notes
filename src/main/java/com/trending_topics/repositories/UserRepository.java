package com.trending_topics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trending_topics.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

  User findByUsername(String username);

}
