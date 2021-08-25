package com.dev.springboot.reactive.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class DeleteInvoiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		WebClient client = WebClient.create("http://localhost:8080");
		Mono<String> mono = client
				.delete()
				.uri("/invoice/delete/3")
				.retrieve()
				.bodyToMono(String.class);
		mono.subscribe(System.out::println);
		System.out.println("Invoice Deleted!");
	}

}
