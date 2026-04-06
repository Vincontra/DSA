import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemovingSmallestMultiples {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            String s=v.next();
            long ans=0;
            HashSet<Integer>hs=new HashSet<>();
            for (int k=1;k<=n;k++){
                for (int j=k;j<=n;j+=k){
                    if (s.charAt(j-1)=='0'){
                        if (!hs.contains(j)){
                            hs.add(j);
                            ans+=k;
                        }
                    }else{
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
