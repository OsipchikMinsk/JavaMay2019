package cheefcook.service.interfaces;

import cheefcook.entity.Vegetable;
import java.util.List;

public interface CalculatingService {
    public double calculateKiloCalories(List<Vegetable> products);
    public List<Vegetable> sortByKiloCalories(List<Vegetable> products);
    public List<Vegetable> sortByKiloCaloriesAndWeight(List<Vegetable> products);
    public List<Vegetable> findProductBetweenRangeOfKiloCalories (List<Vegetable> products, int start, int finish);
}
