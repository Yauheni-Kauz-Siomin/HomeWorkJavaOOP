
public class Dolphin1 extends Animal implements Swimmable {
    public Dolphin1(String name, String color) {
        super(name, color,0);
    }

    public Dolphin1(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Skree!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 45;
    }
}