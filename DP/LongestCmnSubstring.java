public class LongestCmnSubstring {
    // khud se kiya
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhg";
        int max=Integer.MIN_VALUE;
        int t[][]=new int[x.length()+1][y.length()+1];
        for (int i=1;i<=x.length();i++){
            for (int j=1;j<=y.length();j++){
                if (x.charAt((i-1))==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    max=Math.max(max,t[i][j]);
                }
                else{
                    t[i][j]=0;
                }
            }
        }
        if (max==Integer.MIN_VALUE){
            System.out.println(0);
        }else{
            System.out.println(max);
        }

    }
}

