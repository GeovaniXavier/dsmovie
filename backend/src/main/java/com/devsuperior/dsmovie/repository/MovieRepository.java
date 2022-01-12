package com.devsuperior.dsmovie.repository;

import com.devsuperior.dsmovie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
