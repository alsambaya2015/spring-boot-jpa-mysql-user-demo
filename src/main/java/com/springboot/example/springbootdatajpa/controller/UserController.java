package com.springboot.example.springbootdatajpa.controller;

import com.springboot.example.springbootdatajpa.entity.User;
import com.springboot.example.springbootdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/users")
  public User create(@RequestBody User user) {
    return userRepository.save(user);
  }

  @GetMapping("/users")
  public List<User> findAll() {
    return userRepository.findAll();
  }

  @PutMapping("/users/{user_id}")
  public User update(@PathVariable("user_id") Long userId, @RequestBody User userObject) {
    User user = userRepository.getOne(userId);
    user.setName(userObject.getName());
    user.setCountry(userObject.getCountry());
    return userRepository.save(user);
  }

  @DeleteMapping("/users/{user_id}")
  public List<User> delete(@PathVariable("user_id") Long userId) {
    userRepository.deleteById(userId);
    // userRepository.delete(userId);
    return userRepository.findAll();
  }

  @GetMapping("/users/{user_id}")
  public User findByUserId(@PathVariable("user_id") Long userId) {
    return userRepository.getOne(userId);
  }

  @GetMapping("/users/email/{user_email}")
  public List<User> getFiltered(@PathVariable("user_email") String email) {
    return userRepository.getUserByEmail(email);
  }
}