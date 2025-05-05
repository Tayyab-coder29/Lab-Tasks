interface Display {
    void show();
}

interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    @Override
    public String aircraftType() {
        return "Passenger Jet";
    }

    @Override
    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Total Capacity: " + calculateCapacity() + " passengers");
    }
}

class CargoPlane implements Aircraft {
    private double length;
    private double width;  
    private final int conversionFactor = 2; 

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String aircraftType() {
        return "Cargo Plane";
    }

    @Override
    public int calculateCapacity() {
        double area = length * width;
        return (int) (area / conversionFactor);
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Cargo Area: " + (length * width) + " sq meters");
        System.out.println("Passenger Equivalent Capacity: " + calculateCapacity());
    }
}

class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    @Override
    public String aircraftType() {
        return "Private Jet";
    }

    @Override
    public int calculateCapacity() {
        return seats;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Total Luxury Seats: " + calculateCapacity());
    }
}

public class AirlineManagement {
    public static void main(String[] args) {
        Aircraft passengerJet = new PassengerJet(30, 6); 
        Aircraft cargoPlane = new CargoPlane(20.0, 5.0); 
        Aircraft privateJet = new PrivateJet(10);        

        System.out.println("=== Airline Management System ===\n");

        passengerJet.show();
        System.out.println();

        cargoPlane.show();
        System.out.println();

        privateJet.show();
    }
}
