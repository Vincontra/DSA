import java.util.HashMap;
import java.util.Scanner;

public class DivideandEqualize {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            HashMap<Integer,Integer>hm=new HashMap<>();
            for (int i=0;i<n;i++){
                int curr=arr[i];
                for (int j=2;j*j<=curr;j++){
                    int cnt=0;
                    while (curr%j==0){
                        curr/=j;
                        cnt++;
                    }
                    hm.put(j,hm.getOrDefault(j,0)+cnt);
                }
                if (curr>1){
                    hm.put(curr,hm.getOrDefault(curr,0)+1);
                }
            }
            boolean che=false;
            for (int i:hm.keySet()){
                if (hm.get(i)%n!=0){
                    System.out.println("No");
                    che=true;
                    break;
                }
            }
            if (!che){
                System.out.println("Yes");
            }



        }
    }
}
