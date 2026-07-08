import java.util.ArrayList;
import java.util.Scanner;

public class PlayerProfileBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Character> players = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create Player");
            System.out.println("2. Display Players");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("Enter your name: ");
                String name = input.nextLine();

                System.out.print("How old are you? ");
                int age = input.nextInt();
                input.nextLine();
                
                System.out.print("Choose character type (1 = Warrior, 2 = Mage): ");
                int type = input.nextInt();
                input.nextLine();
              

                System.out.print("Enter your favorite weapon: ");
                String weapon = input.nextLine();

                System.out.print("Enter your starting health: ");
                double health = input.nextDouble();

                System.out.print("Enter your starting energy: ");
                double energy = input.nextDouble();
                input.nextLine();

                Character p;
                if (type == 1)
                	{
                	p = new Warrior(name,age);
                	}
                else
                {
                	p = new Mage(name,age);
                }
                
                players.add(p);

            } else if (choice == 2) {

                System.out.println("\n===== PLAYER LIST =====");

                if (players.isEmpty()) {
                    System.out.println("No players created yet.");
                } else {

                    for (Character p : players) {

                        System.out.println("\nName: " + p.getName());
                        System.out.println("Age: " + p.getAge());
                        
                        p.attack();
                       
                    }
                }

            } else if (choice != 3) {
                System.out.println("Invalid option.");
            }

        } while (choice != 3);

        input.close();
    }
}
