package com.hampcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hampcode.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
