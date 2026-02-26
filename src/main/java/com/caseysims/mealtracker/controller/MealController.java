package com.caseysims.mealtracker.controller;

import com.caseysims.mealtracker.entity.Meal;

import com.caseysims.mealtracker.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MealController
{

    @Autowired
    MealService mealService;

    @GetMapping("getMeals")
    public List<Meal> getMeals()
    {
        return mealService.getMeals();
    }

}
