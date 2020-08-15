package com.mehmetpekdemir.webflux.shared;

import lombok.Setter;

import java.time.LocalDate;

import lombok.Getter;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Getter
@Setter
public final class GenericResponse {

	private String message;

	private LocalDate date = LocalDate.now();

	public GenericResponse(String message) {
		this.message = message;
	}

}
