
public class Eagle1 extends Animal implements Flyable {
    public Eagle1(String name, String color) {
        super(name, color,2);
    }

    public Eagle1(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 80;
    }
}