package com.springboot.example.springbootdatajpa.repository;

import com.springboot.example.springbootdatajpa.entity.User;
import java.util.List;

public interface UserRepositoryCustom {

  List<User> getUserByEmail(String email);
}