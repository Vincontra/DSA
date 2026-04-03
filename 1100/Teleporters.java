import java.util.Arrays;
import java.util.Scanner;

public class Teleporters {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long c=v.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=v.nextLong();  // cost to use
                arr[i]+=(i+1); // ek sath hi im calc all the cost; totcost=costtouse+cost to go
            }
            Arrays.sort(arr);
            int ans=0;
            int idx=0;
            while (c>0){
                if (idx<n && arr[idx]<=c){
                    c-=arr[idx];
                    ans++;
                    idx++;
                }else{
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
