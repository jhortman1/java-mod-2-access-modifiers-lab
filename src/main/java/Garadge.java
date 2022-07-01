import java.util.ArrayList;
import java.util.List;

public class Garadge {
    private List<Car> cars;

    public Garadge() {
        this.cars = new ArrayList<Car>();
    }

    public void getCars()
    {
        for (Car car : cars) {
            System.out.println(car.toString());
        };
    }

    public void addCar(Car car)
    {
        cars.add(car);
        System.out.println(car.toString() + " Added to Garadge");
    }

    public void removeCar (Car car)
    {
        if(cars.contains(car))
        {
            cars.remove(car);
        }
        else
        {
            System.out.println("Sorry no such car in garadge.");
        }
        
    }

}
