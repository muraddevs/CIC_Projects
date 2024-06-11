package CIC.TestCIC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @GetMapping("/getall")
    public  String getall(){

        return  "scsc";
    }

    @PostMapping(
    )
    public int Create(int id){


        return  id+7;
    }
}
