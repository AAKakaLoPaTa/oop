package lesson2;

import java.time.LocalDate;

public class Doctor extends Employee implements surgicalOperationAble,injectionOperationAble{
    private Nurse assistent; // ВИЖУ ПРОБЛЕМУ - ассистент не зависит от клиники, получается что для любой клиники у доктора будет персональный ассистент!!!
    // Логичней сделать отдельную связь ассистент(ы)-доктор-клиника, но пока не представляю как (((
    public Doctor(String name, LocalDate birthdate, Nurse assistent) {
        super(name, birthdate);
        this.assistent = assistent;
    }
    public Doctor(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.assistent = null;
    }
    public Nurse getAssistent(){
        return assistent;
    }
    public void setAssistent(Nurse nurse){
        assistent = nurse;
    }
    public void setAssistent(){
        assistent = null;
    }
}
