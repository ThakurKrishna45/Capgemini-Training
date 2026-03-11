
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Job j1= new Job("Developer",1);
        Job j2= new Job("Tester",3);
        Job j3= new Job("AI",2);
        Job[] arr = new Job[]{j1,j2,j3};
        Arrays.sort(arr,new PriorityComparator());
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
    }
}
