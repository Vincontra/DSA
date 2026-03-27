//import java.util.Scanner;
//public class CountSubsetSumGivenSum {
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        //top down
//       // int arr[]={2,3,7,8,10};
//        //int sum=2;
//        int pqr[]={28,4,3,27,0,24,26};
//        int sum=24;
//        int t[][]=new int[pqr.length+1][sum+1];
//        for (int i=0;i<pqr.length+1;i++){
//            for (int j=0;j<sum+1;j++){
//                t[i][j]=-1;
//            }
//        }
//        System.out.println(count(t,pqr,sum,pqr.length));
//    }
//
//    public static int count(int t[][],int arr[],int sum,int n){
//        if (t[n][sum]!=-1){
//            return t[n][sum];
//        }
//        if (sum==0){
//                int zeros=0;
//                for (int i=0;i<n;i++){
//                    if(arr[i]==0){
//                        zeros++;
//                    }
//                }
//                return (int) Math.pow(2,zeros);
//        }
//        if (n==0){
//            return 0;
//        }
//        if (sum-arr[n-1]>=0){
//            return t[n][sum]=count(t,arr,sum-arr[n-1],n-1)+count(t,arr,sum,n-1);
//        }
//        else{
//            return t[n][sum]=count(t,arr,sum,n-1);
//        }
//    }
//}

public class CountSubsetSumGivenSum {
    public static void main(String[] args) {
        int nums[]={28,4,3,27,0,24,26};
        int target=24;
        int t[][]=new int[nums.length+1][target+1];
        for (int i=0;i<=nums.length;i++){
            t[i][0]=1;
        }

        for (int i=1;i<=nums.length;i++){
            for (int j=0;j<=target;j++){
                if (j-nums[i-1]>=0){
                    t[i][j]=t[i-1][j-nums[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        int ans=(t[nums.length][target]);
        System.out.println(ans);
    }
}


