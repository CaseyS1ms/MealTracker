package com.caseysims.mealtracker.entity;


import com.caseysims.mealtracker.MealType;
import jakarta.persistence.*;

@Entity
public class Meal
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float cookTime;
    @Enumerated(EnumType.STRING)
    private MealType mealType;
    private String name;
    private int portionCount;

    public Meal()
    {

    }



    //GETTERS

    public float getCookTime() {
        return cookTime;
    }

    public MealType getMealType() {
        return mealType;
    }

    public String getName() {
        return name;
    }

    public int getPortionCount() {
        return portionCount;
    }

    public long getId() {
        return id;
    }

    //SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setMealType(MealType mealType)
    {
        this.mealType = mealType;
    }

    public void setPortionCount(int portionCount) {
        this.portionCount = portionCount;
    }

    public void setCookTime(float cookTime) {
        this.cookTime = cookTime;
    }
}
