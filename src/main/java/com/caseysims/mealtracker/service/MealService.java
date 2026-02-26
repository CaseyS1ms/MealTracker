package com.caseysims.mealtracker.service;

import com.caseysims.mealtracker.MealType;
import com.caseysims.mealtracker.entity.Meal;
import com.caseysims.mealtracker.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealService
{
    @Autowired
    MealRepository mealRepository;


    public Optional<Meal> getRandomMeal()
    {

        return Optional.empty();
    }//getRandomMeals function

    public List<Meal> getMeals()
    {
        return mealRepository.findAll();
    }//getMeals function

    public void addMeal(Meal meal)
    {
        mealRepository.save(meal);
    }//addMeal function

    public void logPortion()
    {

    }//logPortion Function

    public void addPortion()
    {

    }//addPortion Function

}//MealService class
