//public class CoinChangeProblemMaximumNumberWays {
//    public static void main(String[] args) {
//        int coins[]={1, 2, 3};
//        int sum=4;
//        int t[][]=new int[coins.length+1][sum+1];
////        for (int i=0;i<=coins.length;i++){
////           for (int j=0;j<=sum;j++){
////               t[i][j]=-1;
////           }
////        }
////        System.out.println(ways(coins,t,sum,coins.length));
//
//        for (int i=0;i<=coins.length;i++){
//            t[i][0]=1;
//        }
//
//        for (int i=1;i<=coins.length;i++){
//            for (int j=0;j<=sum;j++){
//                if (j-coins[i-1]>=0){
//                    t[i][j]=t[i][j-coins[i-1]]+t[i-1][j];
//                }else{
//                    t[i][j]=t[i-1][j];
//                }
//            }
//        }
//
//        System.out.println(t[coins.length][sum]);
//
//    }
//
//
//    public static int ways(int arr[],int t[][],int sum,int n) {
//        if (t[n][sum]!=-1){
//            return t[n][sum];
//        }
//        if(sum==0){
//            int z=0;
//            for (int i=0;i<n;i++){
//                if (arr[i]==0){
//                    z++;
//                }
//            }
//            return (int)Math.pow(2,z);
//        }
//        if (n==0){
//            return 0;
//        }
//        if (sum-arr[n-1]>=0) {
//            return t[n][sum]=ways(arr,t,sum-arr[n-1],n)+ways(arr,t,sum,n-1);
//        }
//        else{
//            return t[n][sum]=ways(arr,t,sum, n-1);
//        }
//
//    }
//}


class BVG{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
//        int sum=1;
//        int t[][]=new int[sum+1][arr.length+1];
//        for (int i=0;i<=sum;i++){
//            for (int j=0;j<=arr.length;j++){
//                t[i][j]=-1;
//            }
//        }
        
    }
    public static int func(int n,int sum,int arr[],int t[][]){
        if (t[sum][n]!=-1){
            return t[sum][n];
        }
        if (n==0){
            return 0;
        }
        if (sum==0){
            return 1;
        }
        if (sum-arr[n-1]>=0){
            t[sum][n]=func(n,sum-arr[n-1],arr,t)+func(n-1,sum,arr,t);
        }else{
            t[sum][n]=func(n-1,sum,arr,t);
        }
        return t[sum][n];

    }


}
