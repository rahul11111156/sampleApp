package com.example.Sample.Model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Sample.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
  public User findByUserName(String userName);
}
