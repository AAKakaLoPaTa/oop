package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    List<Animal> patients = new ArrayList<>();
    public void addPatient(Animal animal) {
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
    public List<Animal> getPatients(){
        return patients;
    }
}
