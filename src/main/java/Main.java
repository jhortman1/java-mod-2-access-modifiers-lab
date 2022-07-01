public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Cars -----------------");
        Car c1 = new Car(2020, "VW", "Passat");
        Car c2 = new Car(1969, "Chevy", "Impalla");
        Car c3 = new Car(2019, "Jeep", "Track Hawlk");
        Car c4 = new Car(2015, "Jeep", "Wrangler");
        Car c5 = new Car(2022, "Dodge", "Charger HellCat");
        Car c6 = new Car(2020, "Tesla", "Model S Plaid");

        System.out.println("Adding cars to garadge-----------------");

        Garadge jamesGaradge = new Garadge();

        jamesGaradge.addCar(c1);
        jamesGaradge.addCar(c2);
        jamesGaradge.addCar(c3);
        jamesGaradge.addCar(c4);
        jamesGaradge.addCar(c5);
        jamesGaradge.addCar(c6);

        System.out.println("Getting Cars in Garadge-----------------");

        jamesGaradge.getCars();

        System.out.println("Removing 2 cars-----------------");

        jamesGaradge.removeCar(c1);
        jamesGaradge.removeCar(c2);

        System.out.println("Getting Cars in Garadge-----------------");

        jamesGaradge.getCars();

        System.out.println("Getting car that is not in garadge-----------------");
        
        Car notInGaradge = new Car(2000, "Toyota", "Prius");
        jamesGaradge.removeCar(notInGaradge);

    }
}
