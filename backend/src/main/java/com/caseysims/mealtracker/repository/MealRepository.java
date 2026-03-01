package com.caseysims.mealtracker.repository;

import com.caseysims.mealtracker.MealType;
import com.caseysims.mealtracker.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface MealRepository extends JpaRepository<Meal, Long> {

    List<Meal> findByMealTypeIn(Collection<MealType> mealTypes);
}
