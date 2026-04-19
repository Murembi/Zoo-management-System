public class Penguin extends Animal {

    private String habitat;

    public Penguin(String name, String habitat){
        super(name, "Penguin");
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    @Override
    public void makeSound(){
        System.out.println("Honk");
    }
}
