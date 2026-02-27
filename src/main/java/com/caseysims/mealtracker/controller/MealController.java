package com.caseysims.mealtracker.controller;

import com.caseysims.mealtracker.entity.Meal;

import com.caseysims.mealtracker.service.MealService;
import org.hibernate.annotations.NamedEntityGraphs;
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

    @GetMapping("getRandomMeal")
    public Meal getRandomMeal()
    {
        return mealService.getRandomMeal();
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

    @PutMapping("logPortion")
    public String logPortion(@RequestParam long id)
    {
        mealService.logPortion(id);
        return "Success";
    }

    @DeleteMapping("removeMeal")
    public String removeMEal(@RequestParam long id)
    {
        mealService.removeMeal(id);
        return "Success";
    }

}
