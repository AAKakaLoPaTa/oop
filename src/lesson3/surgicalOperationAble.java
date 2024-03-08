package lesson3;

public interface surgicalOperationAble {
    default boolean toOperate(){
        return true;
    }
}
