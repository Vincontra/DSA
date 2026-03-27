import java.util.HashMap;
import java.util.Scanner;

public class LargestSubarrayWithSum0{

    public static void main(String args[]){

        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=v.nextInt();
        }
        int pfx[]=new int[n];
        pfx[0]=arr[0];
        for (int i=1;i<n;i++){
            pfx[i]=arr[i]+pfx[i-1];
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        hm.put(0,-1);
        for (int i=0;i<n;i++){
            if (!hm.containsKey(pfx[i])){
                hm.put(pfx[i],i);
            }
            else{
                int nextToI=hm.get(pfx[i]);
                int j=i;
                ans=Math.max(ans,j-nextToI);
            }
        }
        System.out.println(ans);
    }
}
