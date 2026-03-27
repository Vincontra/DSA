import java.util.Arrays;
import java.util.Scanner;

public class Bogosort {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while(t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            Arrays.sort(arr);
            for (int i=n-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
}
