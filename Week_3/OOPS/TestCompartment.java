import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1; // Generates 1 to 4

            switch (choice) {
                case 1 -> compartments[i] = new FirstClass();

                case 2 -> compartments[i] = new Ladies();

                case 3 -> compartments[i] = new General();

                case 4 -> compartments[i] = new Luggage();
            }
        }

        System.out.println("Compartment Notices:");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }
    }
}