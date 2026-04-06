import java.util.Scanner;

public class DifferentialSorting {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextLong();
            }
            //agar already sorted then 0
            boolean check=false;
            for (int i=1;i<n;i++){
                if (arr[i]<arr[i-1]){
                    check=true;
                    break;
                }
            }
            if (!check){
                System.out.println(0);
            }else{
                long z=arr[n-1];
                long y=arr[n-2];
                long res=y-z;
                if (res<=y&&y<=z){
                    System.out.println(n-2);
                    for (int i=1;i<=n-2;i++){
                        System.out.println(i+" "+(n-2+1)+" "+(n-1+1));
                    }
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
