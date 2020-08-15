package com.mehmetpekdemir.webflux.service.impl;

import org.springframework.stereotype.Service;

import com.mehmetpekdemir.webflux.entity.Todo;
import com.mehmetpekdemir.webflux.repository.TodoRepository;
import com.mehmetpekdemir.webflux.service.TodoService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Service
@RequiredArgsConstructor // Constructor Injection with lombok
public class TodoServiceImpl implements TodoService {

	private final TodoRepository todoRepository;

	@Override
	public Mono<Todo> getTodoById(String id) {
		return todoRepository.findById(id);
	}

	@Override
	public Flux<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

}
