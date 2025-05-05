public class Task3 {
    // Abstract class 'Super' defining abstract methods for name and sex
    abstract class Super {
        abstract void getName(String name);   // Method to set name
        abstract void getSex(String sex);     // Method to set sex
    }

    // Abstract class extending 'Super' and adding another abstract method
    abstract class AbstClass extends Super {
        abstract void getCountry(String country); // Method to set country
    }

    // Concrete subclass that implements all abstract methods
    class SubClass extends AbstClass {
        String name, sex, country;

        // Implementing method to get name
        void getName(String name) {
            this.name = name;
        }

        // Implementing method to get sex
        void getSex(String sex) {
            this.sex = sex;
        }

        // Implementing method to get country
        void getCountry(String country) {
            this.country = country;
        }

        // Displaying the collected data
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Sex: " + sex);
            System.out.println("Country: " + country);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Need outer class instance to create inner class object
        Task3 outer = new Task3();
        SubClass obj = outer.new SubClass();

        // Setting values
        obj.getName("Adil");
        obj.getSex("Male");
        obj.getCountry("PAK");

        // Displaying values
        obj.display();
    }
}
