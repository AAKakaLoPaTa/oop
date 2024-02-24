import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        super(name, birthdate, vaccinations, illness, owner);
    }
    public void toGo(){
        System.out.println("No, Animal just swimming!");
    }
    public void fly(){
        System.out.println("No, Animal just swimming!");
    }
}
