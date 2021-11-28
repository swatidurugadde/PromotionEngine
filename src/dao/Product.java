package dao;


public class Product {

    String id;
    float price;

    public Product(String id){
        this.id = id;
        switch (id){
            case "A":
                this.price = 50;

                break;
            case "B":
                this.price = 30;

                break;
            case "C":
                this.price = 20;

                break;
            case "D":
                this.price = 15;
                break;
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
