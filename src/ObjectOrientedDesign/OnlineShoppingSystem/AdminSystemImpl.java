package ObjectOrientedDesign.OnlineShoppingSystem;

import ObjectOrientedDesign.OnlineShoppingSystem.enums.Category;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import ObjectOrientedDesign.OnlineShoppingSystem.services.InventoryService;
import ObjectOrientedDesign.OnlineShoppingSystem.services.SearchService;
import java.util.List;

public class AdminSystemImpl implements AdminSystem, CustomerSystem{

    private InventoryService inventoryService;
    private SearchService searchService;

    @Override
    public void addProduct(Product product, Integer count) {

    }

    @Override
    public void removeProduct(Product product) {

    }

    @Override
    public List<Product> searchProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> searchProductByCategory(Category category) {
        return null;
    }
}
