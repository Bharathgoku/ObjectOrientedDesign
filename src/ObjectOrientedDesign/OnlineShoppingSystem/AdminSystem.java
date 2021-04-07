package ObjectOrientedDesign.OnlineShoppingSystem;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;

public interface AdminSystem {

    void addProduct(Product product, Integer count);

    void removeProduct(Product product);



}
