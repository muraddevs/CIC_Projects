package CIC.TestCIC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class productController {
    List<List<String>> allProds = new ArrayList<>();



    @PostMapping("/create")
    public List create(Product product){
        List<String> prods = new ArrayList<>();
        //System.out.println(product.getId() + product.getPrice() + product.getDescription());
        prods.add(product.getId());
        prods.add(product.getPrice().toString());
        prods.add(product.getDescription());
        allProds.add(prods);
        return prods;
    }

    @GetMapping("/getall")
    public  List getall(){

        return allProds;

    }

}
