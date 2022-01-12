package com.devsuperior.dsmovie.repository;

import com.devsuperior.dsmovie.model.Score;
import com.devsuperior.dsmovie.model.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
