abstract class Seat {
    abstract int Calculate_Seat_Price(int noOfSeats);
}

class BusinessClass extends Seat {
    private final int seatPrice = 5000; 

    @Override
    int Calculate_Seat_Price(int noOfSeats) {
        return seatPrice * noOfSeats;
    }
}

class FirstClass extends Seat {
    private final int seatPrice = 3000; 

    @Override
    int Calculate_Seat_Price(int noOfSeats) {
        return seatPrice * noOfSeats;
    }
}

class EconomyClass extends Seat {
    private final int seatPrice = 1500; 

    @Override
    int Calculate_Seat_Price(int noOfSeats) {
        return seatPrice * noOfSeats;
    }
}

public class Lab9_4 {
    public static void main(String[] args) {
        BusinessClass business = new BusinessClass();
        FirstClass first = new FirstClass();
        EconomyClass economy = new EconomyClass();

        int businessSeats = 2;
        int firstSeats = 3;
        int economySeats = 4;

        System.out.println("Business Class Total Price for " + businessSeats + " seats: " + business.Calculate_Seat_Price(businessSeats));
        System.out.println("First Class Total Price for " + firstSeats + " seats: " + first.Calculate_Seat_Price(firstSeats));
        System.out.println("Economy Class Total Price for " + economySeats + " seats: " + economy.Calculate_Seat_Price(economySeats));
    }
}
