package com.mehmetpekdemir.webflux;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import com.mehmetpekdemir.webflux.entity.Todo;
import com.mehmetpekdemir.webflux.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@SpringBootApplication
@RequiredArgsConstructor
public class WebfluxApplication {

	private final TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}

	@EventListener(ApplicationStartedEvent.class)
	public void appStart() {
		IntStream.range(0, 10).mapToObj(this::generate)
		.map(todoRepository::save).collect(Collectors.toList())
		.forEach(item -> item.subscribe());
	}

	private Todo generate(int i) {
		return Todo.builder()
				.userName("Username "+i)
				.description("Description" + i)
				.startDate(LocalDate.now())
				.build();
	}
}
