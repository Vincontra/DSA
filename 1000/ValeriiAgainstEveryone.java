import java.util.*;
public class ValeriiAgainstEveryone {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            HashSet<Long>hs=new HashSet<>();
            int n=v.nextInt();
            long arr;
            for (int i=0;i<n;i++){
                arr=v.nextLong();
                hs.add(arr);
            }
            if (hs.size()==n){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
// what i was thinking that lets say i have any num like we have array 4 3 0 1 2 0
// since we need subaarry sum to be equal right then just take the number and go for left subset sum and right subset sum to be equal; this thought
// comes in my mind just because adding those numbers and then multiplying their 2's powers would result into that number where our index is
// eg: 2^4==2^(3+1)---> 2^3*2^1 but this is not required as we want subarray sum and not subset or subsequence sum so this fails:

// the idea which even if we found the a single duplicate then still we can have ans exist

// if we dont have a single duplicate then ans is never exist we can check just by observation
