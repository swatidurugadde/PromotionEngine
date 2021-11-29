package com.example.controller;

import com.example.dao.ProductPricingRepository;
import com.example.dao.ProductRepository;
import com.example.dao.PromotionsRepository;
import com.example.dao.SkuRepository;
import com.example.dto.Product;
import com.example.dto.ProductPricing;
import com.example.dto.Promotions;
import com.example.dto.Sku;
import com.example.modal.ProductModal;
import com.example.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PromotionController {

    @Autowired
    private PromotionService promotionService;


    @PostMapping("/addProduct")
    public double getCart(@RequestBody ProductModal[] productModals){

        return promotionService.getTotalPrice(productModals);
    }
}
