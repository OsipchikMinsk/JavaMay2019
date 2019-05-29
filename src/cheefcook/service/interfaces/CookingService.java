package cheefcook.service.interfaces;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;

import java.util.HashMap;
import java.util.List;

public interface CookingService {
    public Salad prepareSalad(String name, HashMap<Vegetable, Integer> products);
}
