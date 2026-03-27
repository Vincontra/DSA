import java.util.*;
public class BlackandWhiteStripe {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int k=v.nextInt();
            String curr=v.next();
            int start=0;
            int kth=0;           //BBWBW
            int cntW=0;
            while(kth<k){
                if (curr.charAt(kth)=='W'){
                    cntW++;
                }
                kth++;
            }
            int min=cntW;
            while (kth<n){
                if (curr.charAt(kth)=='W'){
                    cntW++;
                }
                if (curr.charAt(start)=='W'){
                    cntW--;
                }
                start++;
                kth++;
                min=Math.min(min,cntW);
            }
            System.out.println(min);
        }
    }
}
