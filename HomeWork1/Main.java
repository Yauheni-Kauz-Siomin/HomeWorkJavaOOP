import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Мурмот"));
        animals.add(new Dog("Рекс"));
        animals.add(new Eagle("Валера"));
        animals.add(new Duck("Дональд"));
        animals.add(new Dolphin("Весельчак"));
        animals.add(new Whale("Моби Дик"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }

}