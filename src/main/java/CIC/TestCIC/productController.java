package CIC.TestCIC;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class productController {
    newDB data = new newDB();

    @PostMapping("/create")
    public List create(Product product){
        List<String> prods = new ArrayList<>();
        //System.out.println(product.getId() + product.getPrice() + product.getDescription());
        prods.add(product.getId());
        prods.add(product.getPrice().toString());
        prods.add(product.getDescription());
        data.db.add(prods);
        return prods;
    }

    @GetMapping("/getall")
    public  List getall(){
        return data.db;
    }

    @GetMapping("/getids")
    public List<String> getAllIds() {
        return data.getAllIds();
    }

    @GetMapping("/getprices")
    public List<String> getAllPrices() {
        return data.getAllPrices();
    }

    @PostMapping
    public ResponseEntity<newProduct> createNewProduct(@RequestBody newProduct NewProduct) {
        newProduct createdProduct = newProductService.createProduct(NewProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }


}
