public class Wolf extends Animal {

    private String packName;

    public Wolf(String name, String packName){
        super(name, "Wolf");
        this.packName = packName;
    }

    public String getPackName(){
        return packName;
    }

    @Override
    public void makeSound(){
        System.out.println("Howl ");
    }
}