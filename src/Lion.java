public class Lion extends Animal {
    private int prideSize;

    public Lion (String name, int prideSize){
        super(name, "Lion"); //call parent constructure
        this.prideSize = prideSize;
    }

    public int getPrideSize(){
        return prideSize;
    }

    @Override
    public void makeSound(){
        System.out.println("Roar");
    }
}
