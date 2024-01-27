package com.example.corsexercise.controllers;

import org.springframework.web.bind.annotation.*;

//Controller Method CORS Configuration
@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/v1")
public class NameController {


    @GetMapping(path = "/getName")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping(path = "/reverseName/{name}")
    public String reverseName(@PathVariable String name) {
        StringBuilder str = new StringBuilder(name);
        return str.reverse().toString();
    }

}
