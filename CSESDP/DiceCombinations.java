public class DiceCombinations {
    static final int MOD = (int) 1e9 + 7;
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=3;
        int t[]=new int[sum+1];
        for (int i=0;i<=sum;i++){
            t[i]=-1;
        }
        System.out.println(ways(t,sum,arr));
    }
    public static int ways(int t[],int sum,int arr[]){
        if (sum==0){
            // yaha pr we need to do something to calc all the permutations
            // but kaise???
            return 1;
        }
        if (t[sum]!=-1){
            return t[sum];
        }

        int ans=0;
        for (int i=0;i<arr.length;i++){
            if (sum-arr[i]>=0){
                ans=(ans+ways(t,sum-arr[i],arr)%MOD);
            }
        }
        return t[sum]=ans;

    }

}





