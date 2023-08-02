package com.example.Sample.Model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sample.Model.Milestone;

public interface MileRepo extends JpaRepository<Milestone,String>{

}
