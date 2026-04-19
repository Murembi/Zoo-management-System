public class Pandas extends Animal {

    private String bambooPerDay;

    public Pandas(String name, String bambooPerDay){
        super(name, "Panda");
        this.bambooPerDay = bambooPerDay;
    }

    public String getBambooPerDay(){
        return bambooPerDay;
    }

    @Override
    public void makeSound(){
        System.out.println("Bleat "); // pandas make a soft bleating sound
    }
}