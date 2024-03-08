package lesson3;

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
//        barsik.lifeCycle();
//        barsik.fly();
//        barsik.swim();
        System.out.println(eagle.type);
        System.out.println(barsik.type);
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(donald, dorry, eagle, barsik);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyables());
        System.out.println(clinic.getSwimables());
        System.out.println("_________EMPLOYEES__________");
        Nurse nurse1 = new Nurse("Иванова",LocalDate.of(1986,4,28));
        Nurse nurse2 = new Nurse("Петрова",LocalDate.of(1986,4,28));
        Doctor doctor1 = new Doctor("Сидоров",LocalDate.of(1986,4,28), (Nurse) nurse2);
        Doctor doctor2 = new Doctor("Иванов",LocalDate.of(1986,4,28), (Nurse) nurse1);
        Doctor doctor3 = new Doctor("Петров",LocalDate.of(1986,4,28), (Nurse) nurse2);
        Doctor doctor4 = new Doctor("Быков",LocalDate.of(1986,4,28));
        Doctor doctor5 = new Doctor("Ман",LocalDate.of(1986,4,28), (Nurse) nurse2);
        clinic.addEmployees(nurse1, nurse2, doctor1, doctor2, doctor3, doctor4, doctor5);
        System.out.println(clinic.getEmployees());
        System.out.println(doctor5.getType() + ": " + doctor5.name + " -> Assistent: " + doctor5.getAssistent());
        doctor5.setAssistent((Nurse) nurse1);
        System.out.println(doctor5.getType() + ": " + doctor5.name + " -> Assistent: " + doctor5.getAssistent());
        doctor5.setAssistent();
        System.out.println(doctor5.getType() + ": " + doctor5.name + " -> Assistent: " + doctor5.getAssistent());

        System.out.println(clinic.getSurgicalAbles());
        System.out.println(clinic.getBandageAbles());

        System.out.println(doctor1.getAssistent()); // выводим ассистента Мана - Петрова
        clinic.delEmployee(nurse2); // Удаляем из клиники - Петрову
        System.out.println(clinic.getEmployees()); // Проверяем удаление Петровой
        System.out.println(doctor1.getAssistent()); // Но как ассистент она остается, связь ассистент-доктор по всей вдимости нужно описывать в классе VeterinaryCiynic
    }
}