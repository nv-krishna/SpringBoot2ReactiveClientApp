package com.dev.springboot.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Invoice {
	public Invoice() {
		
	}
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String number;
	@NonNull
	private Double amount;
}