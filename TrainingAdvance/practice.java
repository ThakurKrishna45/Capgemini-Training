import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class practice {
    public static void main(String[] args) {
//        List<Integer> al= new CopyOnWriteArrayList<>();
//        al.add(1);
//        al.add(2);
//        al.add(4);
//        for(int a:al) {
//            al.add(3);
//            System.out.println(a);
//        }
        try {
            int x = 10 / 0;
            System.out.println(10.5 / 0);
        } catch (Exception e) {
            System.out.println("AE");
        } finally {
            System.out.println("finally");
        }
    }
}
