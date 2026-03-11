
import java.util.Scanner;

public class cardsum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1,k=1;
        int sereja=0, dima=0;
        while(i<=j){
            int max = (arr[i] > arr[j]) ? arr[i++] : arr[j--];
           
            if(k%2==0){
                dima+=max;
            }else{
                sereja+=max;
            }
            k++;
        }
        System.out.println(sereja +" "+ dima);
    }
}