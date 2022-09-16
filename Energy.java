/*
* The Energy program allows the user to calculate
* the object's energy in joules through its mass
*
* @author  Daria Bernice Calitis
* @version 1.0
* @since   2022-09-15
*/

// Import Scanner
import java.util.Scanner;

/**
* .Class constructor Energy.
*/
final class Energy {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Create Scanner Object
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mass of an object in kilograms: ");

        try {
            // Gets the object's mass
            final float mass = scan.nextFloat();

            // Calculates the object's energy
            final double energy = Math.pow(mass * (2.998 * Math.pow(10, 8)), 2);

            // Prints out the result
            System.out.printf("%fkg of mass would produce %gJ of energy.\n",
                mass, energy
            );
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid Input");
        }

        System.out.println("\nDone.");
    }
}

