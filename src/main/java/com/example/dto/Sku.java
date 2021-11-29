package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sku")
@Getter
@Setter
public class Sku {

    @Id
    private String id;

    @Column(name= "skuName")
    private String skuName;

    @Column(name = "skuPrice")
    private float skuPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public float getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(float skuPrice) {
        this.skuPrice = skuPrice;
    }
}
