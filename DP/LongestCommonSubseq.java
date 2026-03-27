//public class LongestCommonSubseq {
//    //recursion sikha memoize khud se kraaa
//    public static void main(String[] args) {
//        String x="abcdgh";
//        String y="abedfhg";
//        int t[][]=new int[x.length()+1][y.length()+1];
//        for (int i=0;i<=x.length();i++){
//            for (int j=0;j<=y.length();j++){
//                t[i][j]=-1;
//            }
//        }
//        System.out.println(LCS(t,x,y,x.length(),y.length()));
//    }
//    public static int LCS(int t[][],String x,String y,int n,int m){
//        if (t[n][m]!=-1){
//            return t[n][m];
//        }
//        if (n==0||m==0){
//            return 0;
//        }
//        if (x.charAt(n-1)==y.charAt(m-1)) {
//            return t[n][m]=(1+LCS(t,x,y,n-1,m-1));
//        }
//        else{
//            return t[n][m]=Math.max(LCS(t,x,y,n,m-1),LCS(t,x,y,n-1,m));
//        }
//    }
//}

// top-down

import java.util.HashSet;

public class LongestCommonSubseq {
    // khud se kiya
    public static void main(String[] args) {
        String x = "aaaabba";
        String y = "abbaaaa";
        int t[][]=new int[x.length()+1][y.length()+1];
        for (int i=1;i<=x.length();i++){
            for (int j=1;j<=y.length();j++){
                if (x.charAt((i-1))==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        System.out.println(t[x.length()][y.length()]);
    }
}

//public class LCS3 {
//    public static void main(String[] args) {
//        String x = "aaaabba";
//        String y = "abbaaaa";
//        String z = "aaabaaa";
//
//        int n = x.length();
//        int m = y.length();
//        int l = z.length();
//
//        int[][][] dp = new int[n+1][m+1][l+1];
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                for (int k = 1; k <= l; k++) {
//
//                    if (x.charAt(i-1) == y.charAt(j-1) &&
//                            y.charAt(j-1) == z.charAt(k-1)) {
//
//                        dp[i][j][k] = 1 + dp[i-1][j-1][k-1];
//
//                    } else {
//
//                        dp[i][j][k] = Math.max(
//                                Math.max(dp[i-1][j][k], dp[i][j-1][k]),
//                                dp[i][j][k-1]
//                        );
//                    }
//                }
//            }
//        }
//
//        System.out.println(dp[n][m][l]);
//    }
//}