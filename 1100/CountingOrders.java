import java.util.Arrays;
import java.util.Scanner;

public class CountingOrders {
    static long mod=(int)1e9+7;
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            long brr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextLong();
            for (int i=0;i<n;i++)brr[i]=v.nextLong();
            Arrays.sort(arr );
            Arrays.sort(brr);
            long ans=1;
            boolean check=false;
            int b=n-1;
            int a=n-1;

            while (b>=0){
                // ans*=(b se bade kitne hai-b se aage kitne hai)%mod
                // agar b se bade zero then break the loop there only and then ans is 0;
                // as we need to consider for every number
                while(a>=0&&arr[a]>brr[b]){
                    a--;
                }
                int cnt1=n-1-a;  // b se kitne bade
                int cnt2=n-1-b;
                int total=cnt1-cnt2;
                if (total==0){
                    check=true;
                    break;
                }
                ans=((ans)%mod*(total)%mod)%mod;
                b--;
            }

            if (check){
                //System.out.println("khvf");
                System.out.println(0);
            }
            else{
                //System.out.println("vinay");
                System.out.println(ans);
            }
        }
    }
}
