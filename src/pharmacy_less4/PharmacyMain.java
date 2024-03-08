package pharmacy_less4;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penycilline = new Component("Penycilline", "10mg", 100);
        Component water = new Component("Water", "100g", 0);
        Component sugar = new Component("Sugar", "87mg", 80);
        Component vitaminD = new Component("Holecalciferol", "1000ME", 50);

        int n=1;
        IterablePharmacy pharmacy1 = new IterablePharmacy(n++);
        pharmacy1.addComponents(penycilline,sugar,water); // Создали дубликат №1

        IterablePharmacy pharmacy2 = new IterablePharmacy(n++);
        pharmacy2.addComponents(penycilline,sugar);

        IterablePharmacy pharmacy3 = new IterablePharmacy(n++);
        pharmacy3.addComponents(penycilline,water,sugar); // Создали дубликат №2 - !!! порядок компонентов другой!
        // Класс IterablePharmacy в методе addComponent сортирует компоненты самостоятельно для правильного вычисления HashCode

        IterablePharmacy pharmacy4 = new IterablePharmacy(n++);
        pharmacy4.addComponents(penycilline,sugar,vitaminD);

//        Iterator<Component> iterator = pharmacy2;
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        for (Component c: pharmacy2){
            System.out.println(c);
        }

        List<Component> list = new ArrayList<>();
        list.add(sugar);
        list.add(penycilline);
        list.add(water);
        Collections.sort(list);
        System.out.println(list);

        // Homework
        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        System.out.println(pharmacy1.hashCode());
        System.out.println(pharmacy2.hashCode());
        System.out.println(pharmacy3.hashCode());
        System.out.println(pharmacy4.hashCode());
        for(IterablePharmacy i: result){
            System.out.println(i);
        }
        System.out.println(result.size());

        List<IterablePharmacy> listPharmacy = new ArrayList<>();
        listPharmacy.add(pharmacy2);
        listPharmacy.add(pharmacy1);
        listPharmacy.add(pharmacy4);
        listPharmacy.add(pharmacy3);
        System.out.println(listPharmacy);
        Collections.sort(listPharmacy);
        System.out.println(listPharmacy);





    }




}
