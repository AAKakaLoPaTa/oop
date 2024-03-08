package lesson3;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Goable, Flyable {
    public Eagle(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s is running", type);
        return 20;
    }

    @Override
    public double fly() {
        System.out.printf("%s is flying", type);
        return 20;
    }
}
