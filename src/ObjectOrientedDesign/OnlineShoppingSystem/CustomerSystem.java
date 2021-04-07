package ObjectOrientedDesign.OnlineShoppingSystem;

import ObjectOrientedDesign.OnlineShoppingSystem.enums.Category;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import java.util.List;

public interface CustomerSystem {

    List<Product> searchProductByName(String name);

    List<Product> searchProductByCategory(Category category);

}
