import java.util.Scanner;

public class ZooManagementSystem {

    public static void main(String[] args) {

        AnimalDAO dao = new AnimalDAO();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        System.out.println("Welcome to the Zoo Management System");

        while (choice != 4) {

            System.out.println("\nMENU");
            System.out.println("1. View Animals");
            System.out.println("2. Add Animal");
            System.out.println("3. Search Animal");
            System.out.println("4. Exit");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

                // ---------------- VIEW ----------------
                case 1:
                    System.out.println("\nAnimals in the Zoo:");
                    dao.getAllAnimals();
                    break;

                // ---------------- ADD ----------------
                case 2:

                    System.out.println("Select animal type:");
                    System.out.println("1. Wolf");
                    System.out.println("2. Monkey");
                    System.out.println("3. Snake");
                    System.out.println("4. Penguin");
                    System.out.println("5. Lion");
                    System.out.println("6. Elephant");

                    int type = scanner.nextInt();
                    scanner.nextLine();
                    boolean success = false;

                    System.out.println("Enter animal name:");
                    String name = scanner.nextLine();

                    switch (type) {

                        case 1:
                            System.out.println("Enter pack name:");
                            String pack = scanner.nextLine();
                            success = dao.addAnimal(name, "Wolf");
                            break;

                        case 2:
                            System.out.println("Enter intelligence level:");
                            int iq = scanner.nextInt();
                            scanner.nextLine();
                            success = dao.addAnimal(name, "Monkey");
                            break;

                        case 3:
                            System.out.println("Is it venomous? (true/false):");
                            boolean venom = Boolean.parseBoolean(scanner.nextLine());
                            success = dao.addAnimal(name, "Snake");
                            break;

                        case 4:
                            System.out.println("Enter habitat:");
                            String habitat = scanner.nextLine();
                            success = dao.addAnimal(name, "Penguin");
                            break;

                        case 5:
                            System.out.println("Enter pride size:");
                            int prideSize = scanner.nextInt();
                            scanner.nextLine();
                            success = dao.addAnimal(name, "Lion");
                            break;

                        case 6:
                            System.out.println("Enter trunk length:");
                            double trunk = scanner.nextDouble();
                            scanner.nextLine();
                            success = dao.addAnimal(name, "Elephant");
                            break;

                        default:
                            System.out.println("Invalid animal type.");
                            break;
                    }

                    if (success) {
                        System.out.println("Animal added successfully!");
                    } else {
                        System.out.println("Failed to add animal.");
                    }

                // ---------------- SEARCH ----------------
                case 3:
                    System.out.println("Enter animal name or species to search:");
                    String input = scanner.nextLine();
                    dao.searchAnimal(input);
                    break;

                // ---------------- EXIT ----------------
                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
