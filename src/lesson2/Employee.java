package lesson2;

import java.time.LocalDate;

public class Employee {
    private final String type;
    protected String name;
    protected LocalDate birthdate;

    public Employee(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.type = getClass().getSimpleName();
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}'+'\n';
    }
}
