package org.example.controllers;

import org.example.models.Dish;
import org.example.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
@CrossOrigin(origins = "http://localhost:8080")  // Dostosuj do adresu frontendu
public class DishController {
    @Autowired
    private DishService dishService;

    @GetMapping("all")
    public List<Dish> getAllDishes() {
        return dishService.getAll();
    }
}
