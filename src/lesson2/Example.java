package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Example {
    static Map<Character, BinaryOperator<Double>> map = new HashMap<>();
    public static void fillMap(){
        map.put('*', ((x,y) -> x*y));
        map.put('/', ((x,y) -> x/y));
        map.put('+', ((x,y) -> x+y));
        map.put('-', ((x,y) -> x-y));
    }
    public static void main(String[] args) {
        fillMap();
        System.out.println(switchCase('+', 2, 3));
        System.out.println(switchToMap('+', 2, 3));
    }
    public static double switchCase(char operator, int a, int b){
        switch (operator) {
            case '*':
               return a*b;
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '/':
                return a/b;
            default:
                throw new RuntimeException("Операция не поддерживается");
        }
    }
    public static double switchToMap(char operator, double a, double b){
        return map.get(operator).apply(a,b);
    }
}
