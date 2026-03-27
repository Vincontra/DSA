import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Villagers {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            ArrayList<Long>arr=new ArrayList<>();
            for (int i=0;i<n;i++){
                long curr=v.nextLong();
                arr.add(curr);
            }
            Collections.sort(arr,Collections.reverseOrder());
            long ans=0;
            for (int i=0;i<arr.size();i++){
                if (i%2==0){
                    ans+=arr.get(i);
                }
            }
            System.out.println(ans);
        }

    }
}
