package com.dev.springboot.reactive.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.dev.springboot.reactive.model.Invoice;

import reactor.core.publisher.Flux;

@Component
public class GetAllInvoicesRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		WebClient client = WebClient.create("http://localhost:8080");
		Flux<Invoice> flux = client
				.get()
				.uri("/invoice/allInvoices")
				.retrieve()
				.bodyToFlux(Invoice.class);
		flux.doOnNext(System.out::println).blockLast();
	}

}
