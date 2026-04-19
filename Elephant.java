public class Elephant extends Animal {
        private double trunkLength;

    public Elephant(String name, double trunkLength){
        super(name, "Elephant");
        this.trunkLength = trunkLength;
    }

    public double getTrunkLength(){
        return trunkLength;
    }
    @Override
    public void makeSound(){
        System.out.println("Trumpet ");
    }
}
