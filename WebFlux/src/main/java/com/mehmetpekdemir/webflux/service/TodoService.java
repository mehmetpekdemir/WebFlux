package com.mehmetpekdemir.webflux.service;

import com.mehmetpekdemir.webflux.entity.Todo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public interface TodoService {

	Mono<Todo> getTodoById(String id);

	Flux<Todo> getAllTodos();

	void createTodo(Todo todo);

	void deleteTodo(String id);

}
