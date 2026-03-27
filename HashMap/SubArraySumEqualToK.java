import java.util.*;
public class SubArraySumEqualToK{
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int k=v.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=v.nextInt();
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        int cnt=0;
        hm.put(0,1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                cnt+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(cnt);
    }
}