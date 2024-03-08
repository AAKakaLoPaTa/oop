package pharmacy_less4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component>, Comparable<IterablePharmacy> {

    private int index;
    private final List<Component> components;

    public IterablePharmacy(int x) {
        this.index = x;
        this.components = new ArrayList<>();
    }
    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("NOBODY!!!");
        else {
            Collections.addAll(this.components, components);
            Collections.sort(this.components);
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "IterablePharmacy{" +
                "index=" + index +
                ", components=" + components +
                '}';
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
       return getComponents().hashCode();
    }

    @Override
    public int compareTo(IterablePharmacy o) {
        return Integer.compare(this.index, o.index);
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }
}
