
public class Cat1 extends Animal implements Runnable {
    public Cat1(String name, String color) {
        super(name, color,4);
    }

    public Cat1(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getRunningSpeed() {
        return 25;
    }
}