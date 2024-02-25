package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }
    public void swim(){
        System.out.println("Animal not swimming!");
    }
}
