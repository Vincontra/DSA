import java.util.HashMap;
import java.util.Scanner;
public class UniquePaths {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int m=v.nextInt();
        int n=v.nextInt();
//        HashMap<String,Integer>hm=new HashMap();

//        System.out.println(solve(m,n,hm,""));
//        int t[][]=new int[m][n];
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                t[i][j]=-1;
//            }
//        }
        System.out.println(solve(m,n));
    }
//    public static int solve(int i, int j,int [][]t){
//        if(i<0||j<0){
//            return 0;
//        }
//        if (i==0&&j==0){
//            return 1;
//        }
//        if (t[i][j]!=-1){
//            return t[i][j];
//        }
//        int cnt=solve(i-1,j,t)+solve(i,j-1,t);
//        return t[i][j]=cnt;
//    }
    public static int solve(int m,int n){
        int [][]t=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0&&j==0){
                    t[i][j]=1;
                }
                else{
                    t[i][j]=0;
                    if (i>0){
                        t[i][j]+=t[i-1][j];
                    }
                    if (j>0){
                        t[i][j]+=+t[i][j-1];
                    }
                }
            }
        }
        return t[m-1][n-1];
    }
}
