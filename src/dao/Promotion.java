package dao;

import java.util.Map;

public class Promotion {

    int promotionId;
    Map<String, Integer> productInfo;
    float promotionPrice;

    public Promotion(int promotionId, Map<String, Integer> productInfo, float promotionPrice) {
        this.promotionId = promotionId;
        this.productInfo = productInfo;
        this.promotionPrice = promotionPrice;
    }
}
