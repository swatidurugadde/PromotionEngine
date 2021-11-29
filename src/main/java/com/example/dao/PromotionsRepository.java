package com.example.dao;

import com.example.dto.ProductPricing;
import com.example.dto.Promotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromotionsRepository extends JpaRepository<Promotions, String> {

    @Query("Select * from Promotions p where p.productId:= productId order by id desc limit 1")
    Optional<Promotions> findByProductId(String productId);

}
