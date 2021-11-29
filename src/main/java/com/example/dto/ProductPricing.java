package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productPricing")
@Getter
@Setter
public class ProductPricing {

    @Id
    private String id;

    @Column
    @ManyToMany
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productId;

    @Column
    @ManyToMany
    @JoinColumn(name = "skuId", referencedColumnName = "id")
    private Sku skuId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Sku getSkuId() {
        return skuId;
    }

    public void setSkuId(Sku skuId) {
        this.skuId = skuId;
    }
}
