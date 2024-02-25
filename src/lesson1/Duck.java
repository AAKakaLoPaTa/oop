package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }
}
