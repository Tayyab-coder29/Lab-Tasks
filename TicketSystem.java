// Abstract class
abstract class VisitorPass {
    // Abstract method
    abstract int calculateTicketPrice(int numberOfVisitors);
}

// VIPPass class
class VIPPass extends VisitorPass {
    private final int pricePerVisitor = 100;

    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * pricePerVisitor;
    }
}

// FamilyPass class
class FamilyPass extends VisitorPass {
    private final int pricePerVisitor = 50;
    private final int discount = 20; // flat discount for families

    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        int total = numberOfVisitors * pricePerVisitor;
        return total - discount;
    }
}

// GeneralPass class
class GeneralPass extends VisitorPass {
    private final int pricePerVisitor = 30;

    @Override
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * pricePerVisitor;
    }
}

// Main class
public class TicketSystem {
    public static void main(String[] args) {
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass general = new GeneralPass();

        int vipVisitors = 2;
        int familyVisitors = 4;
        int generalVisitors = 3;

        System.out.println("=== Visitor Ticket Prices ===");
        System.out.println("VIP Pass for " + vipVisitors + " visitors: $" + vip.calculateTicketPrice(vipVisitors));
        System.out.println("Family Pass for " + familyVisitors + " visitors: $" + family.calculateTicketPrice(familyVisitors));
        System.out.println("General Pass for " + generalVisitors + " visitors: $" + general.calculateTicketPrice(generalVisitors));
    }
}
