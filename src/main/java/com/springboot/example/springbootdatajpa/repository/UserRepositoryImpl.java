package com.springboot.example.springbootdatajpa.repository;

import com.springboot.example.springbootdatajpa.entity.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepositoryCustom {

  @PersistenceContext
  EntityManager entityManager;

  @Override
  public List<User> getUserByEmail(String email) {

    Query query = entityManager
        .createNativeQuery("SELECT em.* FROM spring_examples_db.user as em " + "WHERE em.email LIKE ?", User.class);
    extracted(query).setParameter(1, email + "%");
    return extracted(query).getResultList();
  }

  private Query extracted(Query query) {
    return query;
  }

}