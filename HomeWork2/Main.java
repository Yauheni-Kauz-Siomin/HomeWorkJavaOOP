
public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat1("Мурмот"))
                .addAnimal(new Dog1("Рекс"))
                .addAnimal(new Duck1("Дональд"))
                .addAnimal(new Eagle1("Валера"))
                .addAnimal(new Dolphin1("Весельчак"))
                .addAnimal(new Nurse1("Мария Ивановна"))
                .addAnimal(new Doctor1("Айболит"));
            


        System.out.println("All animals:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nRunning animals:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + "\n" + r.getRunningSpeed());
        }

        System.out.println("\nSwimming animals:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + "\n" + s.getSwimmingSpeed());
        }

        System.out.println("\nFlying animals:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + "\n" + f.getFlightSpeed());
        }

        System.out.println("\nSpeaking animals:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nГлавный врач ветеринарной клиники:");
        System.out.println(vetClinic.getHeadPhysician());
        vetClinic.getHeadPhysician().speak();
        vetClinic.getHeadPhysician().work();
    }
}