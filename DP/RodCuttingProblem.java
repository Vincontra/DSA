public class RodCuttingProblem {
    public static void main(String[] args) {
        int n=8;
        int price[]={1,5,8,9,10,17,17,20};
        int arr[]={1,2,3,4,5,6,7,8};
        int t[][]=new int[arr.length+1][n+1];
        for (int i=0;i<=arr.length;i++){
            for (int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        System.out.println(Func(t,arr,price,n,n));
    }
    public static int Func(int[][]t,int arr[],int price[],int n,int len){
        if (t[n][len]!=-1){
            return t[n][len];
        }
        if (n==0||len==0){
            return 0;
        }
        if (len>=arr[n-1]){
            return t[n][len]=Math.max(price[n-1]+Func(t,arr,price,n,len-arr[n-1]),Func(t,arr,price,n-1,len));
        }
        else{
            return t[n][len]=Func(t,arr,price,n-1,len);
        }
    }
}
