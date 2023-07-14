
public class Dog1 extends Animal implements Runnable, Swimmable {
    public Dog1(String name, String color) {
        super(name, color,4);
    }

    public Dog1(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 5;
    }

    @Override
    public int getRunningSpeed() {
        return 30;
    }
}