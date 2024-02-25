package lesson2;

import java.time.LocalDate;

public class Nurse extends Employee implements injectionOperationAble,bandageOperationAble{
    public Nurse(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

}
