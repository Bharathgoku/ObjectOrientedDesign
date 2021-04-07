package ObjectOrientedDesign.OnlineShoppingSystem;

import ObjectOrientedDesign.OnlineShoppingSystem.enums.Category;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import ObjectOrientedDesign.OnlineShoppingSystem.services.SearchService;
import java.util.List;

public class CustomerSystemImpl implements CustomerSystem{

    private SearchService searchService;

    @Override
    public List<Product> searchProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> searchProductByCategory(Category category) {
        return null;
    }
}
