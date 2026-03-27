import java.util.Scanner;

public class MinimumLCM {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long n=v.nextLong();
            if (n%2==0){
                // aadhe pr min lcm ayega
                System.out.println(n/2+" "+n/2);
            }
            else{
                // abhi agar prime hai to uska min lcm
                // would be n=1+(n-1) pr hi hoga

                // odd ke case me we need to find the max factor of n
                // n=maxfact+(n-maxfact)
                // aisa kyu as lcm=a*b/gcd(a,b)
                // a max kr rhe so b will min
                // aur niche gcd me jo a hai wahi gcd hoga
                // so a/a got cancelled out and hence we get b as lcm which will be min

                // aa meri jaan

                long num=1;
                for (int i=2;i*i<=n;i++){
                    if (n%i==0){
                        // ho ga kya i is min so n/i will be max jo ki n ka fact hoga matlab apne ko yahi se a milgaya so break
                        // a mila to b=n-a and that's it!!
                        num=n/i;
                        break;
                    }
                }
                System.out.println(num+" "+(n-num));


            }
        }
    }
}
