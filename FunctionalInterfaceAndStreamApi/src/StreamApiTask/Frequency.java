package StreamApiTask;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5,3,6,2,83,68,2,4,9,5};
        Map<Integer,Long> map= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map);
    }
}
