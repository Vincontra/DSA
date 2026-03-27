public class HouseRobber2 {
    public static void main(String[] args) {
        int nums[]={200,3,140,20,10};
        int arr[]=new int[nums.length-1];
        int brr[]=new int[nums.length-1];
        int idx=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=nums[idx];
            idx++;
        }
        // done
        idx=1;
        for (int i=0;i<brr.length;i++){
            brr[i]=nums[idx];
            idx++;
        }
        int t[]=new int[arr.length+1];
        for (int i=0;i<t.length;i++){
            t[i]=-1;
        }

        int dp[]=new int[arr.length+1];
        for (int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans1=func(t,arr,arr.length);
        int ans2=func(dp,brr,brr.length);
        System.out.println(Math.max(ans1,ans2));

    }

    public static int func(int t[],int nums[],int n){
        if (n<=0){
            return 0;
        }
        if(t[n]!=-1){
            return t[n];
        }
        return t[n]=Math.max(nums[n-1]+func(t,nums,n-2),func(t,nums,n-1));
    }


}
