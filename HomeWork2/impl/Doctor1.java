
public class Doctor1 extends Human {
    public Doctor1(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Я лечу животных, а моя медсестра помогает мне");
       }
}