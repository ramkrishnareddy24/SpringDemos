package com.example.RestApiOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApiOne.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

}
