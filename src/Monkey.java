public class Monkey extends Animal {
    private int intelligenceLevel;

    public Monkey(String name, int intelligenceLevel) {
        super(name, "Monkey");
        this.intelligenceLevel = intelligenceLevel;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Ooh Ooh Aah Aah");
    }
}
