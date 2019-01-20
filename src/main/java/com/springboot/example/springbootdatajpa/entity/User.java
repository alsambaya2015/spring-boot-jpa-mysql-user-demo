package com.springboot.example.springbootdatajpa.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User implements Serializable {

  private static final long SerialVersionUID = 1;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String city;

  private String country;

  private String email;

  /**
   * @return the serialversionuid
   */
  public static long getSerialversionuid() {
    return SerialVersionUID;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * @return the country
   */

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

}