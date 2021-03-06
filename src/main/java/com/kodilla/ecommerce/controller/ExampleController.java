package com.kodilla.ecommerce.controller;

import com.kodilla.ecommerce.dto.ExampleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/example")
@RequiredArgsConstructor
public class ExampleController {

    @GetMapping
    public ExampleDto exampleGet() {
        ExampleDto exampleDto = new ExampleDto();
        exampleDto.setMessage("Hello World!");
        return exampleDto;
    }
}
