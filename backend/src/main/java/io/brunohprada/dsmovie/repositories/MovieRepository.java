package io.brunohprada.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.brunohprada.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
