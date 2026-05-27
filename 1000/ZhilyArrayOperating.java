import java.util.*;
public class ZhilyArrayOperating {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextInt();
            for (int i=n-2;i>=0;i--){
                if (arr[i+1]>0){
                    arr[i]+=arr[i+1];
                }
            }
            long ans=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]>0){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
