public class PrintingLongestcommonsubsequence {
    public static void main(String[] args) {
        String x="abac";
        String y="cab";
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
//        System.out.println(t[x.length()][y.length()]);
        StringBuilder sb= new StringBuilder();
        int i=x.length();
        int j=y.length();
        while (i!=0&&j!=0){
            if (x.charAt(i-1)==y.charAt(j-1)){
                sb.append(x.charAt(i-1));
                i--;
                j--;
            }
            else{
                int val1=t[i-1][j];
                int val2=t[i][j-1];
                if (val1>=val2){
                    i--;
                }else{
                    j--;
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
