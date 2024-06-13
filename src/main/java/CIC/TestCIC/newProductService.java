package CIC.TestCIC;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newProductService {
    private final newProductRepository newProductRepository;

    public static newProduct createProduct(newProduct NewProduct) {

        return NewProduct;
    }

    public newProductService(newProductRepository newProductRepository) {
        this.newProductRepository = newProductRepository;
    }

    public List<newProduct> getAllNewProducts() {
        return newProductRepository.findAll();
    }

}
