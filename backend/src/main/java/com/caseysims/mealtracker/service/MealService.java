package com.caseysims.mealtracker.service;

import com.caseysims.mealtracker.MealType;
import com.caseysims.mealtracker.entity.Meal;
import com.caseysims.mealtracker.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class MealService
{
    @Autowired
    MealRepository mealRepository;


    public Meal getRandomMeal()
    {
        Random random = new Random();
        List<MealType> mealTypes = new ArrayList<>(Arrays.asList(MealType.BATCH_REHEAT, MealType.FRESH));
        List<Meal> potentialMeals = mealRepository.findByMealTypeIn(mealTypes);
        int chosenMeal = random.nextInt(potentialMeals.size());
        return potentialMeals.get(chosenMeal);


    }//getRandomMeals function

    public List<Meal> getMeals()
    {
        return mealRepository.findAll();
    }//getMeals function

    public void addMeal(Meal meal)
    {
        mealRepository.save(meal);
    }//addMeal function

    public void removeMeal(long id)
    {
        Optional<Meal> temp = findMeal(id);
        Meal meal = temp.get();
        mealRepository.delete(meal);
    }//removeMeal function

    public void logPortion(long id)
    {
        Optional<Meal> temp = findMeal(id);
        Meal meal = temp.get();
        int portionCount = meal.getPortionCount() - 1;
        meal.setPortionCount(portionCount);
        mealRepository.save(meal);
    }//logPortion Function

    public void addPortion(long id,int amount)
    {
        Optional<Meal> temp = findMeal(id);
        Meal meal = temp.get();
        int portionCount = meal.getPortionCount();
        int newPortion = portionCount + amount;
        meal.setPortionCount(newPortion);
        mealRepository.save(meal);
    }//addPortion Function

    public Optional<Meal> findMeal(long id)
    {
        return mealRepository.findById(id);
    }

}//MealService class
