import java.util.HashMap;
import java.util.Scanner;
public class DistrictsConnection {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextLong();
            }
            boolean iseq=true;
            long val=arr[0];
            int idx=0;
            for (int i=1;i<n;i++){
                if (arr[i]!=val){
                    iseq=false;
                    idx=i;  // this one is for the arr[0]'s anothere instnaces must be connect to each other
                    break;
                }
            }
            if (iseq){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                for (int i=1;i<n;i++){
                    if (arr[i]!=val){
                        System.out.println((1)+" "+(i+1));
                    }else{
                        System.out.println((idx+1)+" "+(i+1));
                    }
                }
            }
        }
    }
}
