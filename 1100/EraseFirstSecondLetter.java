import java.util.HashSet;
import java.util.Scanner;
public class EraseFirstSecondLetter {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        // vpg ----------------->>>>> The Best Always Mark my words!!!!!!!!!1
        while (t-->0){
            int n=v.nextInt();
            String s=v.next();
            HashSet<Character>hashSet=new HashSet<>();
            int ans=0;
            for (int i=0;i<n;i++){
                if (!hashSet.contains(s.charAt(i))){
                    ans+=(n-i-1);
                }
                hashSet.add(s.charAt(i));
            }
            ans+=hashSet.size();  // yaha pr we need to add all the unique chars
            System.out.println(ans);

        }
    }
}

//import java.util.HashSet;
//import java.util.Scanner;
//public class EraseFirstSecondLetter {
//    static HashSet<String> hashSet;
//    static HashSet<String> visited;
//    public static void main(String[] args) {
//        Scanner v = new Scanner(System.in);
//        int t = v.nextInt();
//        while (t-- > 0) {
//            hashSet = new HashSet<>();
//            visited = new HashSet<>();
//            int n = v.nextInt();
//            String s = v.next();
//            // precomp
//            String pfx[] = new String[s.length()];
//            pfx[0] = s.charAt(0) + "";
//            for (int i = 1; i < s.length(); i++) {
//                pfx[i] = pfx[i - 1] + s.charAt(i);
//            }
//            func(s, pfx, 0);
//            System.out.println(hashSet.size());
//        }
//    }
//    public static void func(String s, String pfx[], int idx) {
//        String key = s + "|" + idx;
//        if (visited.contains(key) || idx >= pfx.length) {
//            return;
//        }
//        visited.add(key);
//        // ONLY store result here
//        hashSet.add(s);
//        // skip first
//        if (idx <= pfx.length - 2) {
//            String second = pfx[idx + 1];
//            func(second, pfx, idx + 1);
//        }
//        // skip second
//        if (idx <= pfx.length - 3) {
//            String first = s.charAt(idx) + pfx[idx + 2];
//            func(first, pfx, idx + 2);
//        }
//    }
//}


//import java.util.*;
//
//public class EraseFirstSecondLetter{
//
//    static long[] dp;
//    static int[] next;
//    static String s;
//    static int n;
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int t = v.nextInt();
//        while (t-- > 0) {
//            n = v.nextInt();
//            s = v.next();
//            dp = new long[n];
//            Arrays.fill(dp, -1);
//            next = new int[n];
//            HashMap<Character,Integer>hm=new HashMap<>();
//            // build next occurrence array
//            for (int i=n-1;i>=0;i--) {
//                if (hm.containsKey(s.charAt(i))) {
//                    next[i]=hm.get(s.charAt(i));
//                }
//                else{
//                    next[i]=-1;
//                }
//                hm.put(s.charAt(i), i);
//            }
//            System.out.println(func(0));
//        }
//    }
//    static long func(int i) {
//        if (i >= n){
//            return 0;
//        }
//        if (dp[i]!=-1){
//            return dp[i];
//        }
//        long ans = 1; // string starting at i
//
//        ans += func(i + 1); // remove first
//        ans += func(i + 2); // remove second
//
//        // remove duplicates
//        if (next[i]!=-1){
//            ans-=func(next[i]);
//        }
//        return dp[i]=ans;
//    }
//}