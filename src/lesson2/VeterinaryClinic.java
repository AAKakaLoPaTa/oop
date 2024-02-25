package lesson2;

import java.util.*;

public class VeterinaryClinic {
    List<Animal> patients = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    public void addPatient(Animal animal) {
        patients.add(animal);
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void delEmployee(Employee employee) {
        employees.remove(employee);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public void addEmployees(Employee ... employee){
        Collections.addAll(employees, employee);
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
    public List<Flyable> getFlyables(){
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimables(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal: patients) {
            if(animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
    public List<injectionOperationAble> getInjectionAbles(){
        List<injectionOperationAble> result = new ArrayList<>(employees.size());
        for (Employee employee: employees) {
            if(employee instanceof injectionOperationAble){
                result.add((injectionOperationAble) employee);
            }
        }
        return result;
    }
    public List<surgicalOperationAble> getSurgicalAbles(){
        List<surgicalOperationAble> result = new ArrayList<>(employees.size());
        for (Employee employee: employees) {
            if(employee instanceof surgicalOperationAble){
                result.add((surgicalOperationAble) employee);
            }
        }
        return result;
    }
    public List<bandageOperationAble> getBandageAbles(){
        List<bandageOperationAble> result = new ArrayList<>(employees.size());
        for (Employee employee: employees) {
            if(employee instanceof bandageOperationAble){
                result.add((bandageOperationAble) employee);
            }
        }
        return result;
    }
    public List<Animal> getPatients(){
        return patients;
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}
