//public class PalindromicPartitioning {
//    public static void main(String[] args) {
//        System.out.println(palPartition("vinrar"));
//    }
//    static int palPartition(String s) {
//        int n=s.length();
//        int t[][]=new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                    t[i][j]=-1;
//            }
//        }
//        boolean[][]isPal=new boolean[n][n];
//        for (int i=n-1;i>=0;i--){
//            for (int j=i;j<n;j++){
//                if (s.charAt(i)==s.charAt(j)){
//                    if (j-i<=2)
//                    {
//                        isPal[i][j]=true;
//                    }
//                    else
//                    {
//                        isPal[i][j]=isPal[i+1][j-1];
//                    }
//                }
//            }
//        }
//        return solve(isPal,s,0,n-1,t);
//    }
//
//    static int solve(boolean Pal[][],String s,int i,int j,int t[][]){
//        if(t[i][j]!=-1){
//            return t[i][j];
//        }
//        if(i>=j){
//            return 0;
//        }
//        if(Pal[i][j]){
//            return t[i][j]=0;
//        }
//        int ans=Integer.MAX_VALUE;
//        for(int k=i;k<j;k++){
////            if (t[i][j]!=-1){
////                continue;
////            }
////            int temp=1+solve(s,i,k,t)+solve(s,k+1,j,t);
//            int temp=1;
//            if (t[i][k]!=-1){
//                temp+=t[i][k];
//            }
//            else{
//                int val1=solve(Pal,s,i,k,t);
//                temp+=val1;
//                t[i][k]=val1;
//            }
//
//            if (t[k+1][j]!=-1){
//                temp+=t[k+1][j];
//            }
//            else{
//                int val2=solve(Pal,s,k+1,j,t);
//                temp+=val2;
//                t[k+1][j]=val2;
//            }
//            ans=Math.min(ans,temp);
//        }
//        return t[i][j]=ans;
//    }
//}


class Solution {
    static int palPartition(String s) {
        int n = s.length();
        int t[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }
        boolean[][] isPal = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2)
                        isPal[i][j] = true;
                    else
                        isPal[i][j] = isPal[i + 1][j - 1];
                }
            }
        }
        return solve(isPal, 0, n - 1, t);
    }

    static int solve(boolean[][] Pal, int i, int j, int[][]t) {
        if (i>=j){
            return 0;
        }
        if (Pal[i][j]){
            return 0;
        }
        if (t[i][j]!=-1){
            return t[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            if(!Pal[i][k]){
                continue;
            }
            int l;
            int r;
            if (t[i][k] != -1) {
                l=t[i][k];
            }
            else{
                l=solve(Pal, i, k, t);
            }
            if (t[k + 1][j] != -1){
                r = t[k + 1][j];
            }
            else{
                r = solve(Pal, k + 1, j, t);
            }
            ans=Math.min(ans,1+l+r);
        }
        return t[i][j]=ans;
    }
    public static void main(String[] args) {
        System.out.println(palPartition("vdv"));
    }
}




