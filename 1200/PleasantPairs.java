import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PleasantPairs {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            ArrayList<Pair>arr = new ArrayList<>();
            for (int i=1;i<=n;i++){
                long val=v.nextInt();
                arr.add(new Pair(val,i));
            }
            arr.sort((a, b)->Long.compare(a.val,b.val));
            int ans=0;
            boolean check=false;
            for (int i=1;i<=n;i++){
                for (int j=i+1;j<=n;j++){
                    long c=arr.get(i-1).val;
                    long curr=arr.get(j-1).val;
                    if (c*curr>2L*n){
                        break;
                    }
                    else if (c*curr==arr.get(i-1).idx+arr.get(j-1).idx){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static class Pair{
        long val;
        long idx;
        public Pair(long val,long idx){
            this.val=val;
            this.idx=idx;
        }
    }
}

