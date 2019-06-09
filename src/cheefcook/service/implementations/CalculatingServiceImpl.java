package cheefcook.service.implementations;


import cheefcook.entity.Vegetable;
import cheefcook.service.interfaces.CalculatingService;
import java.util.*;
import java.util.stream.Collectors;

public class CalculatingServiceImpl implements CalculatingService {
    public double calculateKiloCalories(List<Vegetable> products) {

        for (Vegetable vegetable : products) {
            System.out.println("Vegetable " + vegetable);
        }
        return products.
                stream().
                map(Vegetable::getKiloCalories).
                mapToDouble(Double::doubleValue).
                sum();
    }

    public List<Vegetable> sortByKiloCalories(List<Vegetable> products) {
        return products.
                stream().
                sorted(Comparator.comparing(Vegetable::getKiloCalories)).
                collect(Collectors.toList());
    }

    public List<Vegetable> sortByKiloCaloriesAndWeight(List<Vegetable> products) {
        return products.
                stream().
                sorted(Comparator.comparing(Vegetable::getKiloCalories).
                        thenComparing(Comparator.comparing(Vegetable::getWeightInGr))).
                collect(Collectors.toList());

    }

    @Override
    public List<Vegetable> findProductBetweenRangeOfKiloCalories(List<Vegetable> products, int start, int finish) {
        return products.stream()
                .filter(prod -> {
                    double KiloCalories = prod.getKiloCalories();
                    return KiloCalories >= start && KiloCalories <= finish;
                })
                .collect(Collectors.toList());
    }
}

