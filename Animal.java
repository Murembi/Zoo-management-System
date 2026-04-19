public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public Animal() {
        name = "unknown";
        species = "unknown";
    }

    public String getName(){
        return this.name;
    }
    
    public String getSpecies(){
        return this.species;

    }

    public void makeSound(){
        System.out.println("Generic animal sound: ");

    }
    
}
