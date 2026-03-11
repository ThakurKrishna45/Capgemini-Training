package StreamApiTask;


import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr={10,450,20,50,90,15};
        System.out.println(findSecondHighest(arr));
    }
    public static int findSecondHighest(int[] arr){
        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }
}
