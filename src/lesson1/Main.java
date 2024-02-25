package lesson1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
        Animal donald = new Duck("donald",
                LocalDate.of(1984,4,28),
                new ArrayList<>(),
                "H5N1",
                "boss"
        );
        Animal dorry = new Fish("dorry",
                LocalDate.of(1984,4,28),
                new ArrayList<>(),
                "bloating",
                "boss"
        );
        System.out.println(barsik);
        System.out.println(barsik);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        animals.add(donald);
        animals.add(dorry);
//        eagle.wakeup();
//        eagle.wakeup(2);
        barsik.lifeCycle();
        barsik.fly();
        barsik.swim();
        System.out.println(animals);

    }
}