package com.springboot.example.springbootdatajpa.repository;

import com.springboot.example.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

}