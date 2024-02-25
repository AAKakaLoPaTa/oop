package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;
    public Cat(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthdate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
    public void fly(){
        System.out.println("Animal not flying!");
    }
}
