import java.util.Scanner;
public class KillDemodogs {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        long mod=(long)1e9+7;
        while (t-->0){
            long n=v.nextLong();
            long part1=n%mod;
            long part2=(4*((n%mod)*(n%mod)%mod)%mod+3*(n%mod)%mod-1+mod)%mod;
            long ans=(337*part1%mod)*part2%mod;
            System.out.println(ans);
        }
    }
}
//import java.util.Scanner;
//public class KillDemodogs {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t=v.nextInt();
//        while (t-->0){
//            long n=v.nextLong();
//            long mod=(int)1e9;
//            System.out.println(((337%mod)*((n%mod)*((4*n*n+3*n-1)))%mod));
//        }
//
//    }
//}