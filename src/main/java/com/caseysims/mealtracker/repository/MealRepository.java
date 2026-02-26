package com.caseysims.mealtracker.repository;

import com.caseysims.mealtracker.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
