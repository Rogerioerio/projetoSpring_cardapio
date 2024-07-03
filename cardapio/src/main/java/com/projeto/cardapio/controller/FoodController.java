package com.projeto.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food") //endpoint, "cardapio/food"
public class FoodController {

    @GetMapping
    public void getAll() {

    }


}
