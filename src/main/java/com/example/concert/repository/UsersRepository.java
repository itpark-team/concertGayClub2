package com.example.concert.repository;

import com.example.concert.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    public List<User> findAllByOrderByIdAsc();
}
