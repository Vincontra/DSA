public class SequencePatternMatching31 {
    public static void main(String[] args) {
        // ye q aisa hai ki kya x y me present hai kya as a subsequence
        // to khali lcs hi nikal ne ki baar=t ho rhi hai

        String x = "axy";
        String y = "adycpyx";
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
        int len=t[x.length()][y.length()];  // range for lcs ( 0 to min of two strings )

        if (len<Math.min(x.length(),y.length())){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
