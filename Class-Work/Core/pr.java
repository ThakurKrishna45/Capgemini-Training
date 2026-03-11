import java.util.*;

public class pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==2||n==3){
            System.out.println("NO SOLUTION");
            return;
        }
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
         for(int i=2;i<=n;i+=2){
            System.out.print(i+" ");
        }
    }
}