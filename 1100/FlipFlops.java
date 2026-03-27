import java.util.Arrays;
import java.util.Scanner;
public class FlipFlops {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long c=v.nextLong();
            long k=v.nextLong();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextLong();
            Arrays.sort(arr);
            int i=0;
            while (true&&i<=n-1){
                if (c>=arr[i]){
                    long diff=c-arr[i];
                    if (k>=diff){
                        c+=diff+arr[i];
                        k-=diff;
                    }
                    else{
                        c+=arr[i]+k;
                        k=0;
                    }
                }
                else{
                    break;
                }
                i++;
            }
            System.out.println(c);
        }
    }
}
