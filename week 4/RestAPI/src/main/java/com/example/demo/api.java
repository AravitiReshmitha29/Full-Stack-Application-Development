package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class api {

    // GET API
    @GetMapping("/")
    public String home() {
        return "Welcome Reshu! Simple REST API is running!";
    }

    // GET API with Path Variable
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

    // POST API
    @PostMapping("/add")
    public String add(@RequestBody String name) {
        return "Added: " + name;
    }

    // DELETE API
    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable String name) {
        return "Deleted: " + name;
    }
}

