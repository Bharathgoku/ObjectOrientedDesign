package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;

public interface InventoryService {

    void addProduct(Product product, Integer count);

    void removeProduct(Product product);

    void updateProduct(Product product, Integer count);

}
