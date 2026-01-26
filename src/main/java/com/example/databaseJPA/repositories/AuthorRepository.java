package com.example.databaseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.databaseJPA.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    
}
