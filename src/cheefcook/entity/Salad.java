package cheefcook.entity;

import java.util.List;
public class Salad   {
    List<Vegetable> products;
    public Salad(List<Vegetable> products) {
        this.products = products;
    }
    public List<Vegetable> getProducts() {
        return products;
    }
    public void setProducts(List<Vegetable> products) {
        this.products = products;
    }
}









