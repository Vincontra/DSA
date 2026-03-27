public class LongestRepeatingSubsequence {

        public int LongestRepeatingSubsequence(String s) {
            return LCS(s,s);
        }

        public static int LCS(String x,String y){
            int t[][]=new int[x.length()+1][y.length()+1];
            for(int i=1;i<=x.length();i++){
                for(int j=1;j<=y.length();j++){
                    if(x.charAt(i-1)==y.charAt(j-1)&&i!=j){
                        t[i][j]=t[i-1][j-1]+1;
                    }else{
                        t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                    }
                }
            }
            return t[x.length()][y.length()];
        }

    public static void main(String[] args) {
            LongestRepeatingSubsequence o= new
                    LongestRepeatingSubsequence();

        System.out.println(o.LongestRepeatingSubsequence("abcccd"));


    }
}
