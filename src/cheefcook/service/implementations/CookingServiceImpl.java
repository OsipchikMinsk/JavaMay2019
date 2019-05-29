package cheefcook.service.implementations;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;
import cheefcook.service.interfaces.CookingService;
import java.util.HashMap;

public class CookingServiceImpl implements CookingService {
    public Salad prepareSalad(String name, HashMap<Vegetable, Integer> products) {
        Salad salad = new Salad(name, products);
        return salad;
    }
}
