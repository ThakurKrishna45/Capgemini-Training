package StreamApiTask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5,3,6,2,83,68,2,4,9,5};
        Map<Boolean, List<Integer>> ans= Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(e->e%2==0));
        System.out.println(ans);
    }
}
