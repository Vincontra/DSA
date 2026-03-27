import java.util.*;
public class TheCunningSeller {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long n=v.nextLong();
            long ans=0;
            int i=0;
            long val=(long)Math.pow(3,i);
            while (true){
                while (val<=n){
                    i++;
                    val=(long)Math.pow(3,i);
                }
                i--;
                val=(long)Math.pow(3,i);
                long cnt=n/val;
                n=n-(val*cnt);
                ans+=(Math.pow(3,i+1)+i*Math.pow(3,i-1))*cnt;
                if (n<=0){
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
