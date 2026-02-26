package com.caseysims.mealtracker.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Meal
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float timeToCook;
    private String type;
    private String name;
    private int portionsLeft;

    public Meal()
    {

    }

    public Meal(float timeToCook, String type, String name, int portionsLeft)
    {
        this.timeToCook = timeToCook;
        this.type = type;
        this.name = name;
        this.portionsLeft = portionsLeft;
    }

    //GETTERS

    public float getTimeToCook() {
        return timeToCook;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPortionsLeft() {
        return portionsLeft;
    }

    //SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
