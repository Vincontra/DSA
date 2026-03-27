//public class ClimbingStairs {
//    public static void main(String[] args) {
//        int n=2;
//        int arr[]={1,2};
//        int sum=n;
//        int t[][]=new int[n+1][n+1];
//        for (int i=0;i<=n;i++){
//            for (int j=0;j<=n;j++){
//                t[i][j]=-1;
//            }
//        }
//        System.out.println(ways(t,arr, sum, n));
//
//    }
//    public static int ways(int t[][],int arr[],int sum,int n){
//        if(t[n][sum]!=-1){
//            return t[n][sum];
//        }
//        if (sum==0){
//            return 1;
//        }
//        if (n==0){
//            return 0;
//        }
//        if (sum-arr[n-1]>=0){
//            return t[n][sum]=ways(t,arr,sum-arr[n-1],n)+ways(t,arr,sum,n-1);
//        }else{
//            return t[n][sum]=ways(t,arr,sum,n-1);
//        }
//
//    }
//}


public class ClimbingStairs {
    public int climbStairs(int n) {
        int t[]=new int[n+1];
        for (int i=0;i<=n;i++){
            t[i]=-1;
        }
        return (func(n,t));
    }
    public static int func(int n,int t[]){
        if(n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        if(t[n]!=-1){
            return t[n];
        }
        return t[n]=func(n-1,t)+func(n-2, t);
    }
}