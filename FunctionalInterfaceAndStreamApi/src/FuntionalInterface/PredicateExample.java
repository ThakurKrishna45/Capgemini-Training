package FuntionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        using anomynoumns
        Predicate<Integer> predicate= new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>=11;
            }
        };
        System.out.println(predicate.test(10));
//        using lambda
        Predicate<Integer> predicate1= number-> number>0;
        System.out.println(predicate1.test(10));
    }
}
