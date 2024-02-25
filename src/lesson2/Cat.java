package lesson2;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable, Swimable{

    private int legsCount;
    public Cat(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthdate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
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
