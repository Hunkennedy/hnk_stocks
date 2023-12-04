package hunkennedy.stocks;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> GetAllProducts() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> GetProductById(int id) {
        return repository.findById(id);
    }
}
