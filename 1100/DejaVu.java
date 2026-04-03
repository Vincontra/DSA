import java.util.Scanner;

public class DejaVu {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long n=v.nextLong();
            long q=v.nextLong();
            long arr[]=new long[(int)n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextLong();
            }
            long brr[]=new long[(int)q];
            for (int i=0;i<q;i++){
                brr[i]=v.nextLong();
            }
            long min=31;
            for (int i=0;i<q;i++){
                if (brr[i]<min){
                    min=brr[i];
                    long num=(long)Math.pow(2,min);
                    for (int j=0;j<n;j++){
                        if (arr[j]%num==0){
                            arr[j]+=(long)Math.pow(2,min-1);
                        }
                    }
                }
            }
            for (int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
