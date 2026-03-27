import java.util.HashSet;
import java.util.Scanner;

public class RudolfandSnowflakes {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);

        int t=v.nextInt();
        HashSet<Long>hashSet = new HashSet<>();
        // precompute
        for (int i=2;i<=10000;i++){
            // min=1+k+k^2 // kam se kam 3 bar usee aage kitne bhi baar lekin 20 tak like k ki power 20 tak hi as uske aage no need
            // as that number will > 10^6
            long min=1+i+i*i;
            long pow=(long)i*i;
            while (min<=(long)1e6){
                hashSet.add(min);
                pow*=i;
                min+=pow;
            }
        }

        while (t-->0){
            long n=v.nextLong();
            if (hashSet.contains(n)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}



