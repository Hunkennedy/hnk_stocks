package hunkennedy.stocks;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> GetAllProducts();
    Optional<Product> GetProductById(int id);
}
