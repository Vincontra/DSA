public class MCM {
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        System.out.println(matrixMultiplication(arr));
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int t[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i>=j){
                    t[i][j]=0;
                }
                else{
                    t[i][j]=-1;
                }
            }
        }
        return solve(t,arr,1,n-1);
    }
    public static int solve(int t[][],int arr[],int i,int j){
        if(t[i][j]!=-1){
            return t[i][j];
        }
        if(i>=j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=arr[i-1]*arr[k]*arr[j]+solve(t,arr,i,k)+solve(t,arr,k+1,j);
            ans=Math.min(ans,temp);
        }
        return t[i][j]=ans;
    }
}
