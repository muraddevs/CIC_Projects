package CIC.TestCIC;

import java.util.ArrayList;
import java.util.List;

public class newDB {
    List<List> db = new ArrayList<>();

    public List<String> getAllIds() {
        List<String> ids = new ArrayList<>();
        for (List<String> product : db) {
            if (!product.isEmpty()) {
                ids.add(product.get(0)); // Assuming the ID is the first item
            }
        }
        return ids;
    }

    public List<String> getAllPrices() {
        List<String> prices = new ArrayList<>();
        for (List<String> product : db) {
            if (product.size() > 1) {
                prices.add(product.get(1)); // Assuming the price is the second item
            }
        }
        return prices;
    }



}
