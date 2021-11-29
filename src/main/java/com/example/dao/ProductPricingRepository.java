package com.example.dao;

import com.example.dto.ProductPricing;
import com.example.dto.Promotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductPricingRepository extends JpaRepository<ProductPricing, String> {

    @Query("Select * from ProductPricing p where p.productId:= productId order by id desc limit 1")
    Optional<ProductPricing> findByProductId(String productId);
}
