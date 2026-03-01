package FuntionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> function=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        System.out.println(function.apply(4));
        Function<Integer,Integer> function1=integer -> integer*integer;
        System.out.println(function1.apply(5));
    }
}
