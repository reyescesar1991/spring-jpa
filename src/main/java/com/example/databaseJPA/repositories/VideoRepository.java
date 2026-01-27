package com.example.databaseJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.databaseJPA.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer>{

}
