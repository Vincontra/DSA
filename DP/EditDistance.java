//public class EditDistance {
//    public static void main(String[] args) {
//        String x="horse";
//        String y="ros";
//        int t[][]=new int[x.length()+1][y.length()+1];
//        for (int i=0;i<=x.length();i++){
//            for (int j=0;j<=y.length();j++){
//                t[i][j]=-1;
//            }
//        }
//        // convert x to y and not y to x ye q mw given hai.
//
//        System.out.println(func(x,y,x.length(),y.length(),t));
//    }
//    public static int func(String x,String y,int i,int j,int t[][]){
//        if (i==0){
//            return j;
//            // iska matlab aisa hai ki agar string x is over then to make them equal we need y opr
//            // kyu ki x to khali hai matlab ya to y ko khali kro or x me y jitne add kro
//            // isliye return j
//        }
//        if (j==0){
//            return i;
//        }
//
//        if (t[i][j]!=-1){
//            return t[i][j];
//        }
//        if (x.charAt(i-1)==y.charAt(j-1)){
//            return t[i][j]=func(x,y,i-1,j-1,t);
//        }
//        else{
//            int insert=1+func(x,y,i,j-1,t);
//            int delete=1+func(x,y,i-1,j,t);
//            int replace=1+func(x,y,i-1,j-1,t);
//            return t[i][j]=Math.min(insert,Math.min(replace,delete));
//        }
//    }
//
//}

public class EditDistance {
    public static void main(String[] args) {
        String x="horse";
        String y="ros";
        int t[][]=new int[x.length()+1][y.length()+1];

        for (int i=0;i<=x.length();i++){
            t[i][0]=i;
        }

        for (int j=0;j<=y.length();j++){
            t[0][j]=j;
        }

        for (int i=1;i<=x.length();i++){
            for (int j=1;j<=y.length();j++){
                if (x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.min(1+t[i-1][j-1],Math.min(1+t[i][j-1],1+t[i-1][j]));
                }
            }
        }
        System.out.println(t[x.length()][y.length()]);
    }
}

