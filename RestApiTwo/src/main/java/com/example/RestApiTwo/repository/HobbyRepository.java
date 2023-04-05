package com.example.RestApiTwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RestApiTwo.entity.HobbyEntity;

public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{
	@Query("SELECT h.name FROM HobbyEntity h WHERE h.personId=:personId")
    public String findByPersonId(Integer personId);

}
