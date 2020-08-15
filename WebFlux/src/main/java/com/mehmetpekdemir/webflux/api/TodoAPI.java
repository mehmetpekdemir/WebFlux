package com.mehmetpekdemir.webflux.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetpekdemir.webflux.entity.Todo;
import com.mehmetpekdemir.webflux.service.TodoService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // Constructor Injection with lombok
public class TodoAPI {

	private final TodoService todoService;

	@GetMapping("v1/todo/{id}")
	public Mono<Todo> getTodoById(@PathVariable String id) {
		return todoService.getTodoById(id);
	}

	@GetMapping("v1/todo")
	public Flux<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}

}
