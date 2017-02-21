package com.lyn.code.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyn.entity.TestEntity;

@RestController
public class TestRestController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public TestEntity greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new TestEntity(counter.incrementAndGet(), String.format(template, name));
	}
}
