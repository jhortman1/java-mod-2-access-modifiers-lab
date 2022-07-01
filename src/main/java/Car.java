public class Car {
    private int year;
    private String model;
    private String make;

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString()
    {
        return " Year: " + getYear() + " Make: " + getMake() + " Model: " + getModel();
    }
}
