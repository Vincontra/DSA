public class CoinChangeMinimumNumberCoins {
    public static void main(String[] args) {
//        Solution solution = new Solution();
        int coins[]={1,2,3};
        int amt=5;
        int INF=(int)1e9;
//        System.out.println(solution.coinChange(coins,amt));
        int t[][]=new int[coins.length+1][amt+1];
        for (int i=0;i<=coins.length;i++){
            for (int j=0;j<=amt;j++){
                if (j==0){
                    t[i][j]=0;
                }
                else if (i==0&&j>0){
                    t[i][j]=INF;
                }
            }
        }
        for (int i=1;i<=coins.length;i++){
            for (int j=1;j<=amt;j++){
                if (j-coins[i-1]>=0){
                    t[i][j]=Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
//        if(t[coins.length][amt]==(int)1e9){
//            return -1;  // when not possible
//        }
        System.out.println(t[coins.length][amt]);
    }
}
//class Solution {
//    // memoize
//    static final int INF=(int)1e9;
//    public int coinChange(int[] coins, int amount) {
//        int t[][]=new int[coins.length+1][amount+1];
//        for(int i=0;i<=coins.length;i++){
//            for(int j=0;j<=amount;j++){
//                t[i][j]=-1;
//            }
//        }
//        int ans=calc(t,coins,amount,coins.length);
//        if(ans>=INF){
//            return -1;
//        }
//        return ans;
//    }
//    public int calc(int t[][],int arr[],int amt,int n){
//        if(t[n][amt]!=-1){
//            return t[n][amt];
//        }
//        if(amt==0){
//            return 0;
//        }
//        if(n==0&&amt>0){
//            return INF;
//        }
//        if(amt-arr[n-1]>=0){
//            return t[n][amt]=Math.min(1+calc(t,arr,amt-arr[n-1],n),
//                    calc(t,arr,amt,n-1));
//        }
//        else{
//            return t[n][amt]=calc(t,arr,amt,n-1);
//        }
//    }
//}