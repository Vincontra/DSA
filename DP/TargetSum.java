//public class TargetSum {
//    public static void main(String[] args) {
//        int nums[]={1,1,1,1,1};
//        int target=3;
//        int ans[]={0};
//        cnt(ans,nums, nums.length, 0,target);
//        System.out.println(ans[0]);
//    }
//    public static void cnt(int ans[],int arr[],int n,int sum,int target){
//        if (n==0){
//            if (sum==target){
//                ans[0]++;
//            }
//            return;
//        }
//        cnt(ans,arr,n-1,sum+arr[n-1],target);
//        cnt(ans,arr,n-1,sum-arr[n-1],target);
//    }
//}


// khud se memoize bhi kara and khud se recursion bhi likha by ip-op method
//public class TargetSum {
//    public static void main(String[] args) {
//        int nums[]={1,1,1,1,1};
//        int tot=0;
//        for (int i=0;i<nums.length;i++){
//            tot+=nums[i];
//        }
//        int target=3;
//        int t[][]=new int[nums.length+1][2*tot+1];
//        for (int i=0;i<=nums.length;i++){
//            for (int j=0;j<=2*tot;j++){
//                t[i][j]=Integer.MIN_VALUE;
//            }
//        }
//        System.out.println(cnt(t,nums,nums.length,0,target,tot));
//
//    }
//    public static int cnt(int t[][],int arr[],int n,int sum,int target,int tot){
//        if (n==0){
//            if (sum==target){
//                return 1;
//            }
//            return 0;
//        }
//        if (t[n][sum+tot]!=Integer.MIN_VALUE){
//                return t[n][sum+tot];
//        }
//        return t[n][sum+tot]=cnt(t,arr,n-1,sum+arr[n-1],target,tot)+cnt(t,arr,n-1,sum-arr[n-1],target,tot);
//    }
//}

// mene khud se to krliya
// exact same as Subset Sum with Given Diff aisa bol rha aditya verma lekin likhu kaise

public class TargetSum {
    public static void main(String[] args) {
        // khud se top-down likhata hu yaha pr
        int nums[]={1,1,1,1,1};
        int tot=0;
        for (int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        int target=3;
        if (Math.abs(target) > tot){
            System.out.println(0);
        }
        else{
            int[][]t=new int[nums.length+1][2*tot+1];
            t[0][tot]=1;
            for (int i=1;i<=nums.length;i++){
                for (int j=-tot;j<=tot;j++){
                    int ways=0;
                    if(j-nums[i-1]>=-tot&&j-nums[i-1]<=tot){
                        ways+=t[i-1][j-nums[i-1]+tot];
                    }
                    if(j+nums[i-1]>=-tot&&j+nums[i-1]<=tot) {
                        ways+=t[i-1][j+nums[i-1]+tot];
                    }
                    t[i][j+tot]=ways;
                }
            }
            System.out.println(t[nums.length][target+tot]);
        }

    }
}





