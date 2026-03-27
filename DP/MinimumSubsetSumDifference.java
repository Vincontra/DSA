//public class MinimumSubsetSumDifference {
//    public static void main(String[] args) {
//        int arr[]={1, 6, 11, 5};
//        int tot=0;
//        for(int i=0;i<arr.length;i++){
//            tot+=arr[i];
//        }
//        int t[][]=new int[arr.length+1][tot+1];
//        for (int i=0;i<=arr.length;i++){
//            for (int j=0;j<=tot;j++){
//                t[i][j]=-1;
//            }
//        }
//        System.out.println(min(t,arr,tot,arr.length,tot));
//    }
//    public static int min(int t[][],int arr[],int tot,int n,int sum1) {
//        if (t[n][sum1]!=-1){
//            return t[n][sum1];
//        }
//        if (n==0){
//            return Math.abs(tot-2*sum1);
//        }
//        if (sum1-arr[n-1]>=0){
//            return t[n][sum1]=Math.min(min(t,arr,tot,n-1,sum1-arr[n-1]),min(t,arr,tot,n-1,sum1));
//        }
//        else{
//            return  t[n][sum1]=min(t,arr,tot,n-1,sum1);
//        }
//    }
//}


public class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        int arr[]={1,2,3,11};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        boolean t[][]=new boolean[arr.length+1][sum+1];
        SumSetSum(t,arr,sum);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<=sum/2;i++){
            if (t[arr.length][i]){
                min=Math.min(min,sum-2*i);
            }
        }
        System.out.println(min);
    }

    public static void SumSetSum(boolean t[][],int arr[],int sum){
        for (int i=0;i<=arr.length;i++){
            for (int j=0;j<=sum;j++){
                if (j==0){
                    t[i][j]=true;
                }
            }
        }
        for (int i=1;i<=arr.length;i++){
            for (int j=1;j<=sum;j++){
                if (j-arr[i-1]>=0){
                    t[i][j]=(t[i-1][j-arr[i-1]])||(t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
    }
}