import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OmkarandLastClassofMath {

    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
//        boolean prime[]=new boolean[100000000+1];
//        seive(prime);
        while (t-->0){
            long n=v.nextLong();
            // n largest prime factor
//            long max=Long.MIN_VALUE;
            // among all factors largest fac which is prime
            //usko we need to calc
//            ArrayList<Long>l1=primeFactors(n);
//            for (int i=0;i<l1.size();i++){
//                max=Math.max(max,l1.get(i));
//            }
//            if (max!=n){
//                System.out.println(max+" "+(n-max));
//            }else{
//                System.out.println(1+" "+(n-1));
//            }
            boolean check=false;
            for (int i=2;i*i<=n;i++){
                if (n%i==0){
                    System.out.println(n/i+" "+(n-(n/i)));
                    check=true;
                    break;
                }
            }
            if (!check){
                System.out.println(1+" "+(n-1));
            }
        }
    }
//    public static void seive(boolean arr[]){
//        for (int i=0;i<arr.length;i++){
//            arr[i]=true;
//        }
//        arr[0]=false;
//        arr[1]=true;
//        for (int i=2;i*i<=arr.length;i++){
//            if (arr[i]){
//                for (int j=i*i;j<=arr.length;j+=i){
//                    arr[j]=false;
//                }
//            }
//        }
//    }
   public static ArrayList<Long> primeFactors(long n) {
        ArrayList<Long> factors = new ArrayList<>();
        for (long p = 2; p * p <= n; p++) {
            while (n % p == 0) {
                factors.add(p);
                n /= p;
            }
        }
        if (n>1){
            factors.add(n);
        }
        return factors;
    }
}
