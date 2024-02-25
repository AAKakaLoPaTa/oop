package lesson1;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthdate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthdate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthdate = birthdate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }
    public void lifeCycle(){
        System.out.println("_________________________");
        this.wakeup();
        this.eat();
        this.play();
        this.sleep();
    }
    private void wakeup(){
        System.out.println("Animal is wakeup");
    }
    private void wakeup(int time){
        System.out.println("Animal is wakeup in " + time);
    }
    private void eat() {
        System.out.println("Animal ate");
    }
    private void play() {
        System.out.println("Animal played");
    }
    private void sleep() {
        System.out.println("Animal sleeping");
    }
    public void toGo(){
        System.out.println("Animal is going");
    }
    public void fly(){
        System.out.println("Animal is flying");
    }
    public void swim(){
        System.out.println("Animal is swimming");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                "}\n";
    }
}
