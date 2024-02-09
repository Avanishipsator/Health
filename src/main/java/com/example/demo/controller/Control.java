package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Control {
	@GetMapping
	public ApiSuccess get() {
		ApiSuccess succes = new ApiSuccess();
		succes.setMessage("get:: 200 ok");
		succes.setStatus("true");

		return succes;
	}

	@PostMapping
	public ApiSuccess Post() {
		ApiSuccess succes = new ApiSuccess();
		succes.setMessage("Post:: 200 ok");
		succes.setStatus("true");
		return succes;
	}

	@PutMapping
	public ApiSuccess PUT() {
		ApiSuccess succes = new ApiSuccess();
		succes.setMessage("Put");
		succes.setStatus("true");
		return succes;
	}

	@DeleteMapping
	public ApiSuccess delete() {
		ApiSuccess succes = new ApiSuccess();
		succes.setMessage("Delete");
		succes.setStatus("true");
		return succes;
	}

}
