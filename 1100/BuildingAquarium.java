import java.util.Scanner;
public class BuildingAquarium {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long x=v.nextLong();
            long arr[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextLong();
            long l=1;
            long h=Long.MIN_VALUE;
//            h=(long)1e13;
            for (int i=0;i<n;i++){
                h=Math.max(h,arr[i]);
            }
            h=Math.max(h,x)+Math.min(h,x);  // aisa ho sakta ki max height se bhi jyada lekr dekhe height so that utna pani available ho
            long ans=0;
            while (l<=h){
                long mid=(h-l)/2+l;
                if (func(arr,mid,x)){
                    ans=Math.max(ans,mid);
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
//    Upper bound should be max(arr) + x — derived from: "If I have only 1 column, I can raise height by at most x." This is always the tightest and safest bound regardless of constraints.
    public static boolean func(long arr[],long mid,long x){
        long cnt=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<mid){
                cnt+=mid-arr[i];
            }
        }
        if (cnt<=x){
            return true;
        }
        return false;
    }
}