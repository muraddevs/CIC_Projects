package CIC.TestCIC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class newProductController {

    private final newProductService productService;


    @Autowired
    public newProductController(newProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/created")
    public ResponseEntity<newProduct> createProduct(@RequestBody newProduct NewProduct) {
        newProduct createdProduct = productService.createProduct(NewProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @GetMapping("/getalld")
    public List<newProduct> getAllProducts() {
        return productService.getAllNewProducts();
    }



}
