
public class Nurse1 extends Human {
    public Nurse1(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Оказываю помощь доктору в лечении животных");
    }
}