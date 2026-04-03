import java.util.Scanner;

public class Quests {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int k=v.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            for (int i=0;i<n;i++){
                brr[i]=v.nextInt();
            }

            int max=Integer.MIN_VALUE;
            int sum=0;
            int pfxmax=Integer.MIN_VALUE;
            for (int i=0;i<Math.min(n,k);i++){
                sum+=arr[i];
                pfxmax=Math.max(pfxmax,brr[i]);
                int left=k-i-1;
                max = Math.max(max,sum+pfxmax*left);
            }
            System.out.println(max);
        }
    }
}
