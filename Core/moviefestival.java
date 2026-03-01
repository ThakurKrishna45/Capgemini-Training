
// import java.util.*;

// public class moviefestival{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][] arr= new int[n][2];
//         for(int i=0;i<n;i++){
//             arr[i][0]= sc.nextInt();
//             arr[i][1]= sc.nextInt();
//         }
//         Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
//             int ans=1;
//             int j=0;
//         for (int i = 1; i < n; i++) {
//             if(arr[i][0]>=arr[j][1]){
//                 ans++;
//                 j=i;
//             }
//         }
//         System.out.println(ans);
//     }
// }
import java.io.*;
import java.util.*;

public class moviefestival {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]); // sort by end time
            }
        });

        int ans = 0;
        int lastEnd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= lastEnd) {
                ans++;
                lastEnd = arr[i][1];
            }
        }

        System.out.println(ans);
    }
}
