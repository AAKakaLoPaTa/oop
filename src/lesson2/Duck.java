package lesson2;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Swimable, Flyable{
    public Duck(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s is flying", type);
        return 20;
    }

    @Override
    public double run() {
        System.out.printf("%s is running", type);
        return 20;
    }

    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 20;
    }
}
