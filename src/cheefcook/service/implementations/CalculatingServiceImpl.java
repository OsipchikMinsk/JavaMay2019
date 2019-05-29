package cheefcook.service.implementations;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;
import cheefcook.service.interfaces.CalculatingService;
import java.util.*;
import java.util.stream.Collectors;

public class CalculatingServiceImpl implements CalculatingService {
    public double calculateKiloCalories(Salad salad) {
        double kiloCalories = 0;
        for (Map.Entry<Vegetable, Integer> product : salad.getProducts().entrySet()) {
            kiloCalories += product.getValue();
        }
        return kiloCalories;
    }

    public  List<Vegetable> sortByKiloCalories(Salad salad) {
        List<Vegetable> products =  new ArrayList<>();
        products.addAll(salad.getProducts().keySet());
        return products.stream().sorted(Comparator.comparing(Vegetable::getKiloCaloriesInG)).collect(Collectors.toList());
    }

    public  List<Vegetable> sortByKiloCaloriesAndKeepingTime(Salad salad) {
        List<Vegetable> products =  new ArrayList<>();
        products.addAll(salad.getProducts().keySet());
        return products.stream().sorted(Comparator.comparing(Vegetable::getKiloCaloriesInG).
                thenComparing(Comparator.comparing(Vegetable::getKeepingTime))).collect(Collectors.toList());
    }
}
