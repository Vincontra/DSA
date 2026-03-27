import java.util.Scanner;

public class ManikChand {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            int max=arr[n-1]-arr[0];
            for(int i=1;i<n;i++){
                max = Math.max(max,arr[i]-arr[0]);
            }
            for(int i=0;i<n-1;i++){
                max = Math.max(max,arr[n-1]-arr[i]);
            }
            for (int i=0;i<n-1;i++){
                max=Math.max(max,arr[i]-arr[i+1]);
            }
            System.out.println(max);
        }
    }
}
