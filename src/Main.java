import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double v = .1986;
        Animal barsik = new Cat("barsik",
                LocalDate.of(1984,4,28),
                new ArrayList<>(),
                "чумка",
                "boss",
                4
        );
        Animal eagle = new Eagle("cluv",
                LocalDate.of(1984,4,28),
                new ArrayList<>(),
                "чумка",
                "boss"
        );
        System.out.println(barsik);
        System.out.println(barsik);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
//        eagle.wakeup();
//        eagle.wakeup(2);
        barsik.lifeCycle();

    }
}