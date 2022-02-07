package EncapsulationExercises.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> productList;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.productList = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            productList.add(product);
            this.money -= product.getCost();
            System.out.printf("%s bought %s%n", this.name, product.getName());
            return;
        }
        System.out.printf("%s can't afford %s%n", this.name, product.getName());
    }

    @Override
    public String toString() {
        return this.productList.isEmpty() ?
                String.format("%s - Nothing bought", this.name) :
                String.format("%s - %s" ,this.name, getAllProducts());
    }

    public String getAllProducts() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.productList.size(); i++) {
            stringBuilder.append(productList.get(i).getName());
            if (i != productList.size()-1){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
