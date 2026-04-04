import java.util.*;
public class FindtheCar {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int[]arr=new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = v.nextInt();
            }
            int ans=0;
            for (int i=0;i<n-1;i++){
                for (int j=i+1;j<n;j++){
                    ans=Math.max(ans,arr[i]^arr[j]);
                }
            }
            System.out.println(ans);
        }
    }
}