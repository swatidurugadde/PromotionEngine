package com.example.service;

import com.example.dao.ProductPricingRepository;
import com.example.dao.ProductRepository;
import com.example.dao.PromotionsRepository;
import com.example.dao.SkuRepository;
import com.example.dto.Product;
import com.example.dto.ProductPricing;
import com.example.dto.Promotions;
import com.example.dto.Sku;
import com.example.modal.ProductModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements PromotionService{


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PromotionsRepository promotionsRepository;

    @Autowired
    private SkuRepository skuRepository;

    @Autowired
    private ProductPricingRepository productPricingRepository;

    @Override
    public double getTotalPrice(ProductModal[] productModals) {
        double totalPrice=0;
        //get product  by id
        for(ProductModal product: productModals){
            Product productFetched = productRepository.findById(product.getProductId()).orElse(null);

            if(productFetched != null){

                ProductPricing productPricing = productPricingRepository.findByProductId(productFetched.getId()).orElse(null);
                if(productPricing != null) {
                    Sku sku = productPricing.getSkuId();

                    Promotions promotions =
                            promotionsRepository.findByProductId(productFetched.getId()).orElse(null);

                    if(promotions != null){
                        if (product.getQuantity()>0){
                            int remainder =product.getQuantity() % promotions.getMinQuantity();
                            if(remainder ==0){
                                totalPrice += product.getQuantity() * sku.getSkuPrice() * promotions.getDiscount();
                            }
                            else if(product.getQuantity() < promotions.getMinQuantity()){
                                totalPrice += product.getQuantity() * sku.getSkuPrice();
                            }
                            else{
                                totalPrice += ((product.getQuantity() - remainder) * sku.getSkuPrice() * promotions.getDiscount())
                                        +(remainder * sku.getSkuPrice());
                            }
                        }

                    }
                }
            }
        }

        System.out.println("Total price :"+totalPrice);
        //get sku
        return totalPrice;
    }
}
