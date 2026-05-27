import java.util.Scanner;
public class ANDSumBig {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t= v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int k=v.nextInt();
            long ans=1;
            long mod=1000000000+7;
            for (int i=1;i<=k;i++){
                ans=(ans*n)%mod;
            }
            // bhai to be honest idk how this works but it works
            //"If it Works Dont Touch It"
            System.out.println(ans);
        }
    }
}
