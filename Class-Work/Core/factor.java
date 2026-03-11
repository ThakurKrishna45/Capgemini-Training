
import java.io.*;
public class factor{
    public static void main(String[] args) throws IOException{
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the number of integers
        int n = Integer.parseInt(br.readLine());
        int maxVal = 0;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
           arr[i]=Integer.parseInt(br.readLine());
           if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
    }
       int[] factorCount = new int[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i; j <= maxVal; j += i) {
                factorCount[j]++;
            }
        }
        // Output the number of factors for each input value
        for (int i = 0; i < n; i++) {
            System.out.println(factorCount[arr[i]]);
        }
    }
}