package com.example.foodSharingg.repository;

import com.example.foodSharingg.model.FoodGiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodGiverRepository extends JpaRepository<FoodGiver, Long> {
}
