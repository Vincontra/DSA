import java.util.Scanner;

public class CatCycle {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long n=v.nextLong();
            long k=v.nextLong();
            if (n%2==0){
                if (k%n==0){
                    System.out.println(n);
                }else{
                    System.out.println(k%n);
                }
            }
            else{
                k--;
                long val=(k+((k)/(n/2)))%n;
                System.out.println(val+1);
            }
        }
    }
}
