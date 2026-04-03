//import java.util.Scanner;
//
//public class ThousandTonsTNT {
//    static long ans=0;
//    public static void main(String[] args) {
//        Scanner v=new Scanner(System.in);
//        int n=v.nextInt();
//        long arr[]=new long[n];
//        for (int i=0;i<n;i++){
//            arr[i]=v.nextLong();
//        }
//        func(arr,0,n-1,0);
//        System.out.println(ans);
//    }
//    public static void func(long arr[],int l,int r,int lev){
//        if (l>r){
//            return;
//        }
//        int mid=(r-l)/2+l;
//        ans+=arr[mid]*(lev+1);
//        func(arr,l,mid-1,lev+1);
//        func(arr,mid+1,r,lev+1);
//    }
//}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThousandTonsTNT {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            long pfx[]=new long[n];
            for (int i=0;i<n;i++)arr[i]=v.nextLong();
            pfx[0]=arr[0];
            for (int i=1;i<n;i++){
                pfx[i]=pfx[i-1]+arr[i];
            }
            // k tukde hone ka matlab hi kya hai ki n ke k tukde means uske factors
            ArrayList<Integer>l1=new ArrayList<>();
            for (int i=1;i*i<=n;i++){
                if (n%i==0){
                    l1.add(i);
                    l1.add(n/i);
                }
            }

            // now for each k we have to find the max and min and overall max
            long ans=Long.MIN_VALUE;

            for (int j=0;j<l1.size();j++){
                long min=Long.MAX_VALUE;
                long max=Long.MIN_VALUE;
                int k=l1.get(j);
                long prev=0;
                for (int i=k-1;i<n;i+=k){
                    long curval=pfx[i]-prev;
                    prev=pfx[i];
                    min=Math.min(min,curval);
                    max=Math.max(max,curval);
                }
                ans=Math.max(ans,max-min);
            }

            System.out.println(ans);
        }
    }
}