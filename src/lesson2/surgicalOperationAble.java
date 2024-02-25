package lesson2;

public interface surgicalOperationAble {
    default boolean toOperate(){
        return true;
    }
}
