package com.example.lab07;
import java.io.Serializable;
import jaavax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class User implements Serializable{
   private Long id;
   @NotNull  
   @Size(min=3, max=30)
   private String name;
   @Email
   private String email;
    
   public User() {};
    
   public User(String name, String email) {
      this.name = name;
      this.email = email;
   };
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }    
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   @Override
   public String toString() {
      return "User [id=" + id + ", name=" + name + ", email=" + email + ", toString()=" + super.toString() + "]";
   }
    
    