package com.mehmetpekdemir.webflux.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetpekdemir.webflux.entity.Todo;
import com.mehmetpekdemir.webflux.service.TodoService;
import com.mehmetpekdemir.webflux.shared.GenericResponse;

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
	public ResponseEntity<Mono<Todo>> getTodoById(@PathVariable("id") String id) {
		final Mono<Todo> todo = todoService.getTodoById(id);
		return ResponseEntity.ok(todo);
	}

	@GetMapping("v1/todo")
	public ResponseEntity<Flux<Todo>> getAllTodos() {
		final Flux<Todo> todos = todoService.getAllTodos();
		return ResponseEntity.ok(todos);
	}

	@PostMapping("v1/todo")
	public ResponseEntity<?> createTodo(@RequestBody Todo todo) {
		todoService.createTodo(todo);
		return ResponseEntity.ok(new GenericResponse("Todo created."));
	}

	@DeleteMapping("v1/todo/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable("id") String id) {
		todoService.deleteTodo(id);
		return ResponseEntity.ok(new GenericResponse("Todo deleted."));
	}

}
