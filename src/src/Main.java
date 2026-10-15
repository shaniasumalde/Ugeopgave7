import java.util.Scanner;

    // Opgave 1: Fang fejlen og prøv igen

    public class Main {
        private Scanner scan = new Scanner(System.in);

        public int promptNumber(String msg) {
            System.out.println(msg);
            try {
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ugyldigt input - prøv igen.");
                return promptNumber(msg);
            }
        }

        public static void main(String[] args) {
            Main m = new Main();
            int tal = m.promptNumber("Indtast et tal:");
            System.out.println("Du indtastede: " + tal);


            // Opgave 2: Kast en fejl selv

            Drink drink = new Drink();

            try {
                drink.setPrice(45.0);
                System.out.println("Prisen er sat til " + drink.getPrice());
            } catch (IllegalArgumentException e) {
                System.out.println("Fejl: " + e.getMessage());
            }


            try {
                drink.setPrice(-10.0);
                System.out.println("Prisen er sat til " + drink.getPrice());
            } catch (IllegalArgumentException e) {
                System.out.println("Fejl: " + e.getMessage());
            }

//2b: Kast en fejl ved ugyldigt indeks



        }
    }
