package com.mehmetpekdemir.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mehmetpekdemir.webflux.entity.Todo;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Repository
public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {

}
