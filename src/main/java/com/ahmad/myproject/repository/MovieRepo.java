package com.ahmad.myproject.repository;

import com.ahmad.myproject.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie,String> {

    Movie findByTitle (String title);
}
