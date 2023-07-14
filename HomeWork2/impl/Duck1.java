
public class Duck1 extends Animal implements Flyable, Runnable, Swimmable {
    public Duck1(String name, String color) {
        super(name, color,2);
    }

    public Duck1(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Qriack!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }
}