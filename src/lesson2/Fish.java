package lesson2;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable{
    public Fish(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 20;
    }
}
