public class Snake extends Animal {
    private boolean venomous;

    public Snake(String name, boolean venomous) {
        super(name, "Snake");
        this.venomous = venomous;
    }

    public boolean isVenomous() {
        return venomous;
    }

    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }
}
