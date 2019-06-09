package cheefcook.service.interfaces;
import cheefcook.entity.Vegetable;
import java.util.ArrayList;
import java.util.List;

public interface CookingService {

    public ArrayList<Vegetable> prepareSalad(List<String> products);
}
