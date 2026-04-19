import java.util.Scanner;
import java.util.ArrayList;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declaring variables 
        // String[] animalNames= new String[20];  // an empty array
        // String[] animalSpecies= new String[20];

        //Animal[] animals = new Animal[20];

        int choice = 0; //declaring choice
        //int animalCount = 0; //tracks how many animals exists

        ArrayList<Animal> animals = new ArrayList<>();
       
        animals.add(new Wolf("Ghost", "North Pack"));
        animals.add(new Monkey("George", 9));
        animals.add(new Snake("Slither", true));
        animals.add(new Penguin("Pingu", "Antarctica"));
        animals.add(new Lion("Simba", 10));
        animals.add(new Elephant("Big",50));
    
        System.out.println("Welcome to the Zoo Management System");

        // add a while loop
        while(choice != 4){

        // FEATURE 1
        System.out.println("menu");
        System.out.println("1. View Animals");
        System.out.println("2. Add Animals");
        System.out.println("3. Search Animal"); //search for an animal 
        System.out.println("4. Exit");
        try{
            choice = scanner.nextInt(); // Scanner scanner input
            scanner.nextLine();// clear newline
        } catch(Exception e){
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // clear the bad input
            choice = 0; // reset choice so loop continues

        }

        switch(choice){
            case 1: 
                System.out.println("Animals in the zoo: ");

                StringBuilder list =new StringBuilder();

                // using string builders to display animals

                list.append("Animal List\n");
                list.append("--------------------\n");

                // user selects view animals
                if(animals.isEmpty()){// if the zoo is empty
                    list.append("No animals added yet.\n");

                }else{
                    for(Animal a : animals){

                        // print animals names and species that exists
                        list.append("Name: ").append(a.getName()).append("\n");
                        list.append("Species: ").append(a.getSpecies()).append("\n");
                    }
                }
                System.out.println(list.toString());
                break;

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

                System.out.println("Enter animal name:");
                String name = scanner.nextLine();

                switch(type){
                    case 1:
                        System.out.println("Enter pack name:");
                        String pack = scanner.nextLine();
                        animals.add(new Wolf(name, pack));
                        break;

                    case 2:
                        try{
                            System.out.println("Enter intelligence level:");
                            int iq = scanner.nextInt();
                            scanner.nextLine();
                            animals.add(new Monkey(name, iq));
                        } catch (Exception e){
                            System.out.println("Invalid input. iq size must be a number.");
                            scanner.nextLine(); // clear bad input
                        }
                        break;

                    case 3:
                        System.out.println("Is it venomous? (true/false):");
                        boolean venom = scanner.nextBoolean();
                        scanner.nextLine();
                        animals.add(new Snake(name, venom));
                        break;

                    case 4:
                        System.out.println("Enter habitat:");
                        String habitat = scanner.nextLine();
                        animals.add(new Penguin(name, habitat));
                        break;

                    case 5:
                        try{
                            System.out.println("Enter pride size:");
                            int prideSize = scanner.nextInt();
                            scanner.nextLine();
                            animals.add(new Lion(name, prideSize));
                        } catch(Exception e){
                            System.out.println("Invalid input. Pride size must be a number.");
                            scanner.nextLine(); // clear bad input
                        }

                        break;

                    case 6:
                        try{
                            System.out.println("Enter trunk length:");
                            double trunk = scanner.nextDouble();
                            scanner.nextLine();
                            animals.add(new Elephant(name, trunk));
                        } catch (Exception e){
                            System.out.println("Invalid input. Trunk size must be a number.");
                            scanner.nextLine(); // clear bad input
                        }
                        break;

                    default:
                        System.out.println("Invalid option");
                    }

                    System.out.println("Animal added!");
                    break;

                case 3:
                    System.out.println("Enter animal species or name to search: ");
                    String input= scanner.nextLine();

                    boolean found = false;

                    for(Animal a: animals){
                        if(a.getName().equalsIgnoreCase(input) || a.getSpecies().equalsIgnoreCase(input)){
                            System.out.println("Animal found");
                            System.out.println("Name: " + a.getName());
                            System.out.println("Species: " + a.getSpecies());

                            found = true;
                            }

                    }
                    
                    if(!found) {
                        System.out.println("No " + input + "found");
                    } 

                    break;
                
                case 4:
                    System.out.println("Exiting program...");
                    break;
                
                default:
                    System.out.println("Invalid option");
            }

            }

            scanner.close();

        }
        
    }
