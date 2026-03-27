public class AlmostPalindromic {
    public static int almostPalindromic(String s) {
        int n = s.length();
        int [][]t=new int[n+1][n+1];
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        int max=1;
        for (int i=0;i<n; i++) {
            for (int j = i; j < n; j++) {
                int lps = LPS(s, i, j, t);
                int len=j-i+1;
                if (len-lps<=1){
                    max=Math.max(max,len);
                }
            }
        }
        return max;
    }
    public static int LPS(String s,int i,int j,int [][]t){
        if (i>j){
            return 0;
        }
        if (i==j){
            return 1;
        }
        if (t[i][j]!=-1)
            return t[i][j];

        if (s.charAt(i)==s.charAt(j)){
            t[i][j]=2+LPS(s, i+1, j-1,t);
        }
        else {
            t[i][j]=Math.max(LPS(s,i+1,j,t),LPS(s,i, j-1,t));
        }
        return t[i][j];
    }

    public static void main(String[] args) {
        String s="abca";
        System.out.println(almostPalindromic(s));
    }
}
