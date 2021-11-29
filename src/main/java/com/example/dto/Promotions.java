package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "promotions")
@Getter
@Setter
public class Promotions {

    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productId;

    @Column(name = "minQuantity")
    private int minQuantity;

    @Column(name = "discount")
    private float discount;

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

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
