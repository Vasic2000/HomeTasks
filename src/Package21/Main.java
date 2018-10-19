package Package21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

            Car ferrari = new Car(250, 300, "Red");
            Car mercedes = new Car(260, 310, "Silver");
            Car porshe = new Car(210, 400, "Black");
            Car taxi = new Car(100, 125, "Yellow");

        cars.add(ferrari);
        cars.add(mercedes);
        cars.add(porshe);
        cars.add(taxi);

        cars.sort(cars);

        for(
            Car cc :cars)

            {
                System.out.println(cc.color);
            }

    }
    Comparator<Car> comp = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.color.compareTo(o2.color);
        }
}