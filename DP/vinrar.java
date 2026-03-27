import java.util.*;
public class vinrar {
    static  long mod=(int)1e9+7;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        int k=v.nextInt();
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i=1;i<=k;i++){
            int a1=v.nextInt();
            int b1=v.nextInt();
            a=Math.min(a,a1);
            b=Math.max(b,b1);
        }
        long ans[]=new long[b];
        long fact[]=func(a,b);
        int idx=0;
        for(int i=a;i<=b;i++){
            if(i<k){
                ans[idx]=1;
            }
            else if(i==k){
                ans[idx]=2;
            }
            else{
                long q=i-k;  // itne q
                long d=k;
                d+=q;  // mix total q and d
                ans[idx]+=(fact[(int)d]/fact[(int)q])%mod;
                ans[idx]++; /// only q
                if(i%k==0){
                    ans[idx]++;
                }
            }

        }
    }
    public static long[] func(long a,long b){
        long fact[]=new long[(int)b+1];
        fact[0] = 1;
        for (int i = 1; i <= fact.length; i++){
            fact[i] = fact[i - 1] * i % mod;
        }
        return fact;
    }

}

//
//import java.util.*;
//
//public class Solution {
//    static final int MAX = 100000;
//    static final long MOD = 1000000007;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//        int k = sc.nextInt();
//
//        int[] a = new int[t];
//        int[] b = new int[t];
//
//        int maxB = 0;
//
//        for (int i = 0; i < t; i++) {
//            a[i] = sc.nextInt();
//            b[i] = sc.nextInt();
//            maxB = Math.max(maxB, b[i]);
//        }
//
//        // DP array
//        long[] dp = new long[maxB + 1];
//        dp[0] = 1;
//
//        for (int i = 1; i <= maxB; i++) {
//            dp[i] = dp[i - 1];
//
//            if (i >= k) {
//                dp[i] = (dp[i] + dp[i - k]) % MOD;
//            }
//        }
//
//        // Prefix sum array
//        long[] pfx = new long[maxB + 1];
//        for (int i = 1; i <= maxB; i++) {
//            pfx[i] = (pfx[i - 1] + dp[i]) % MOD;
//        }
//
//        // Answer queries
//        for (int i = 0; i < t; i++) {
//            long ans = (pfx[b[i]] - pfx[a[i] - 1] + MOD) % MOD;
//            System.out.println(ans);
//        }
//    }
//}
