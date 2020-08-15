package com.mehmetpekdemir.webflux.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Data
@Builder
@Document
public class Todo {

	@Id
	private String id;

	private String userName;

	private String description;

	private LocalDate startDate;

}
