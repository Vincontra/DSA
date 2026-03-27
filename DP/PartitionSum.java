public class PartitionSum {
    public static void main(String[] args) {
        // lc pr solve kra hai khud se
        // isliye nhi likha
       // 416. Partition Equal Subset Sum
    }
}
//class Solution {
//    public boolean canPartition(int[] nums) {
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//        }
//        if(sum%2==1){
//            return false;
//        }else{
//            return Sum(nums,sum/2);
//        }
//    }
//    static Boolean Sum(int arr[], int sum) {
//        boolean t[][]=new boolean[arr.length+1][sum+1];
//        for (int i=0;i<=arr.length;i++){
//            for (int j=0;j<=sum;j++){
//                if (j==0){
//                    t[i][j]=true;
//                }
//            }
//        }
//        for (int i=1;i<=arr.length;i++){
//            for (int j=1;j<=sum;j++){
//                if (j-arr[i-1]>=0){
//                    t[i][j]=(t[i-1][j-arr[i-1]])||(t[i-1][j]);
//                }else{
//                    t[i][j]=t[i-1][j];
//                }
//            }
//        }
//        return t[arr.length][sum];
//    }
//}