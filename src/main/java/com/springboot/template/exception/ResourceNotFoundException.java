package com.springboot.template.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Greeting is not found")
public class ResourceNotFoundException extends RuntimeException {
}
