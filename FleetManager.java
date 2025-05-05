abstract class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected int builtYear;
    protected double capacity;

    public Vehicle(String vehicleNumber, String model, int builtYear, double capacity) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.builtYear = builtYear;
        this.capacity = capacity;
    }

    public abstract double calculateFuelEfficiency();

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Built Year: " + builtYear);
        System.out.println("Capacity: " + capacity + " tons");
    }
}

class Truck extends Vehicle {
    private double fuelUsed;
    private double distanceTraveled;

    public Truck(String vehicleNumber, String model, int builtYear, double capacity,
                 double fuelUsed, double distanceTraveled) {
        super(vehicleNumber, model, builtYear, capacity);
        this.fuelUsed = fuelUsed;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double calculateFuelEfficiency() {
        return distanceTraveled / fuelUsed;
    }
}

class Van extends Vehicle {
    private double fuelConsumed;
    private double totalDistance;

    public Van(String vehicleNumber, String model, int builtYear, double capacity,
               double fuelConsumed, double totalDistance) {
        super(vehicleNumber, model, builtYear, capacity);
        this.fuelConsumed = fuelConsumed;
        this.totalDistance = totalDistance;
    }

    @Override
    public double calculateFuelEfficiency() {
        return totalDistance / fuelConsumed;
    }
}

class Motorcycle extends Vehicle {
    private double litersUsed;
    private double kmDriven;

    public Motorcycle(String vehicleNumber, String model, int builtYear, double capacity,
                      double litersUsed, double kmDriven) {
        super(vehicleNumber, model, builtYear, capacity);
        this.litersUsed = litersUsed;
        this.kmDriven = kmDriven;
    }

    @Override
    public double calculateFuelEfficiency() {
        return kmDriven / litersUsed;
    }
}

public class FleetManager {
    public static void main(String[] args) {
        Vehicle truck = new Truck("TR123", "Volvo", 2018, 12, 150, 1200);
        Vehicle van = new Van("VN456", "Ford", 2020, 3, 60, 700);
        Vehicle motorcycle = new Motorcycle("MC789", "Yamaha", 2022, 0.2, 5, 250);

        Vehicle[] fleet = {truck, van, motorcycle};

        for (Vehicle v : fleet) {
            System.out.println("-------------");
            v.displayInfo();
            System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + " km/l");
        }
    }
}