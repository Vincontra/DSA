import java.util.Scanner;

public class DC {
    static final int MOD = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        long sum=v.nextLong();
        long t[]=new long[(int)(sum+1)];
        t[0]=1; // base
        for (int i=1;i<=sum;i++){
            long ans=0;
            for (int j=0;j<arr.length;j++){
                if (i-arr[j]>=0){
                    ans=(ans+t[i-arr[j]])%MOD;
                }
            }
            t[i]=ans;
        }
        System.out.println(t[(int)sum]);
    }
    public static long ways(long t[],long sum,int arr[]){
        if (t[(int)sum]!=-1){
            return t[(int)sum];
        }
        if (sum==0){
            // yaha pr we need to do something to calc all the permutations
            // but kaise???
            return 1;
        }
        long ans=0;
        for (int i=0;i<arr.length;i++){
            if (sum-arr[i]>=0){
                ans=((ans+ways(t,sum-arr[i],arr)%MOD)%MOD);
                //t[(int)sum]=ans;
            }

        }
        return t[(int)sum]=ans;
    }

}





