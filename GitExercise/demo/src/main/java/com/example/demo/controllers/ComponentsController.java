package com.example.demo.controllers;


import com.example.demo.models.Component;
import com.example.demo.repositories.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/components")
public class ComponentsController {

    @Autowired
    private ComponentRepository componentRepository;

    @GetMapping
    public List<Component> list() {
        return componentRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{name}")
    public ResponseEntity<List<Component>> getComponentByName(@PathVariable String name) {
        return new ResponseEntity<>(componentRepository.findByName(name), HttpStatus.OK);
    }

    @PostMapping
    public Component create(@RequestBody final Component component) {
        return componentRepository.saveAndFlush(component);
    }

    @GetMapping("/count")
    public Long totalComponentsInStore(){
        return componentRepository.count();
    }
}
