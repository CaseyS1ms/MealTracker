package com.caseysims.mealtracker.controller;

import com.caseysims.mealtracker.entity.Meal;

import com.caseysims.mealtracker.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController
{

    @Autowired
    MealService mealService;

    @GetMapping("getMeals")
    public List<Meal> getMeals()
    {
        return mealService.getMeals();
    }

    @PostMapping("addMeal")
    public String  addMeal(@RequestBody Meal meal)
    {
        mealService.addMeal(meal);
        return "Success";
    }

    @PutMapping("addPortion")
    public String addPortion(@RequestParam long id, @RequestParam int amount)
    {
        mealService.addPortion(id, amount);
        return "Success";
    }

}
