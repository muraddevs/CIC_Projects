package CIC.TestCIC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class testController {

    List<String> prods = new ArrayList<>();
    @GetMapping("/getall")
    public  List getall(){

        return prods;
    }

    @PostMapping("/create")
    public List create(Product product){

        System.out.println(product.getId() + product.getPrice() + product.getDescription());
        prods = new ArrayList<>();
        prods.add(product.getId());
        prods.add(product.getPrice().toString());
        prods.add(product.getDescription());
        return prods;
    }
}
