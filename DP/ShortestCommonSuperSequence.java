public class ShortestCommonSuperSequence {
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
        System.out.println(x.length()+y.length()-t[x.length()][y.length()]);
        // ye khali length nikali
        // niche printing

        StringBuilder sb= new StringBuilder();
        int i=x.length();
        int j=y.length();
        while (i>0&&j>0){
            if (x.charAt(i-1)==y.charAt(j-1)){
                sb.append(x.charAt(i-1));
                i--;
                j--;

            }
            else{
                int val1=t[i-1][j];
                int val2=t[i][j-1];
                if (val1>val2){
                    sb.append(x.charAt(i-1));
                    i--;
                }else{
                    sb.append(y.charAt(j-1));
                    j--;
                }
            }
        }

        while(i>0){
            sb.append(x.charAt(i-1));
            i--;
        }
        while (j>0){
            sb.append(y.charAt(j-1));
            j--;
        }
        System.out.println(sb.reverse().toString());

//
//        String x=str1;
//        String y=str2;
//        int t[][]=new int[x.length()+1][y.length()+1];
//        for (int i = 1; i <= x.length(); i++) {
//            for (int j = 1; j <= y.length(); j++) {
//                if (x.charAt(i - 1) == y.charAt(j - 1)) {
//                    t[i][j] = 1 + t[i - 1][j - 1];
//                } else {
//                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
//                }
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        int i = x.length();
//        int j = y.length();
//        while (i > 0 && j > 0) {
//            if (x.charAt(i - 1) == y.charAt(j - 1)) {
//                sb.append(x.charAt(i - 1));
//                i--;
//                j--;
//            }
//            else if (t[i - 1][j] > t[i][j - 1]) {
//                sb.append(x.charAt(i - 1));
//                i--;
//            }
//            else {
//                sb.append(y.charAt(j - 1));
//                j--;
//            }
//        }
//        while (i > 0) {
//            sb.append(x.charAt(i - 1));
//            i--;
//        }
//        while (j > 0) {
//            sb.append(y.charAt(j - 1));
//            j--;
//        }
//        String scs=sb.reverse().toString();
//        return scs;
//

        
    }
}

//AABEBCDD

//DDCBEBAA




