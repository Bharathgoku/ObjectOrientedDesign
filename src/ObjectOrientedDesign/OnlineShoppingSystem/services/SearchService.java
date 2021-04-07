package ObjectOrientedDesign.OnlineShoppingSystem.services;

import ObjectOrientedDesign.OnlineShoppingSystem.enums.Category;
import ObjectOrientedDesign.OnlineShoppingSystem.entities.Product;
import java.util.List;

public interface SearchService {

    List<Product> searchByName(String name);

    List<Product> searchByCategory(Category category);

}
