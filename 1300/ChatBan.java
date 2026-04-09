import java.util.Scanner;

public class ChatBan {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int  t=v.nextInt();
        while (t-->0){
            long k=v.nextLong();
            long x=v.nextLong();
            long low=1;
            long high=2*k-1;
            long tot=k*k;
            long ans=2*k-1;
            while (low<=high){
                long mid=(high-low)/2+low;
                long cnt=cnt(mid,k,tot);
                if (cnt>=x){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if (ans==-1){
                ans=1;
            }
            System.out.println(ans);
        }
    }
    public static long cnt(long mid,long k,long tot){
        if (mid<k){
            return mid*(mid+1)/2;
        }else{
            long t=2*k-1-mid;
            return tot-(t*(t+1)/2);
        }

    }
}
