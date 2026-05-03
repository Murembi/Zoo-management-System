public class Animal {
    private String name;
    private String species;
    private int id;

    public Animal(String name, String species, int id){
        this.name = name;
        this.species = species;
        this.id = id;

    }

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public Animal() {
        name = "unknown";
        species = "unknown";
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    
    public String getSpecies(){
        return species;
    }

    public void makeSound(){
        System.out.println("Generic animal sound: ");

    }
    
}
