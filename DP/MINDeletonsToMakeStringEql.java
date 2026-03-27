public class MINDeletonsToMakeStringEql {
        static int minDeletions(String s) {
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(c);
            }
            String x=s;
            String y=sb.reverse().toString();
            int lcs=LCS(x,y);
            return s.length()-lcs;
        }

        public static int LCS(String x,String y){
            int t[][]=new int[x.length()+1][y.length()+1];
            for(int i=1;i<=x.length();i++){
                for(int j=1;j<=y.length();j++){
                    if(x.charAt(i-1)==y.charAt(j-1)){
                        t[i][j]=1+t[i-1][j-1];
                    }
                    else{
                        t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                    }
                }
            }
            return t[x.length()][y.length()];
        }

    public static void main(String[] args) {

    }
}

