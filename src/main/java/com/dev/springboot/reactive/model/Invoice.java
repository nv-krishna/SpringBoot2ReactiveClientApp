package com.dev.springboot.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private String number;
	@NonNull
	private Double amount;
}