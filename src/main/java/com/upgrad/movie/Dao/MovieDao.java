package com.upgrad.movie.Dao;

import com.upgrad.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface MovieDao extends JpaRepository<Movie,Integer> {

}
