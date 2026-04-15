import java.util.Scanner;

public class Omkar {
    public static void main(String[] args) {
        Scanner v=new Scanner((System.in));
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            // since what we want is lcm min
            // iska matlab we need max gcd
            // agar prime hua then
            // ans would be 1 and n-1
            // other wise miin proper divisor
            // so that gcd max so lcm min and also a+b==n
            boolean  check=false;
            for (int i=2;i*i<=n;i++){
                if (n%i==0){
                    int val=n/i;
                    check=true;
                    System.out.println(val+" "+(n-val));
                    break;
                }
            }
            if (!check){
                // prime ka vishay miya
                System.out.println(1+" "+(n-1));
            }
        }

    }
}
