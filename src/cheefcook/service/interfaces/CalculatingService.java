package cheefcook.service.interfaces;

import cheefcook.entity.Salad;
import cheefcook.entity.Vegetable;

import java.util.List;
import java.util.Set;

public interface CalculatingService {
    public double calculateKiloCalories(Salad salad);
    public List<Vegetable> sortByKiloCalories(Salad salad);
    public List<Vegetable> sortByKiloCaloriesAndKeepingTime(Salad salad);
}
