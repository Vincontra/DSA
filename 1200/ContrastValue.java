import java.util.*;

public class ContrastValue {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            long arr[]=new long[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextLong();
            }
            // i guess ans is the cnt of peaks and non peaks
            int ans=0;
            ArrayList<Long>l1=new ArrayList<>();
            l1.add(arr[0]);
            // just removing the duplicates
            for (int i=1;i<n;i++){
                if (arr[i]!=arr[i-1]){
                    l1.add(arr[i]);
                }
            }
            if (l1.size()==1){
                System.out.println(1);
                continue;
            }
            for (int i=1;i<l1.size()-1;i++){
                if ((l1.get(i)>l1.get(i-1)&&l1.get(i)>l1.get(i + 1))||(l1.get(i)<l1.get(i-1)&&l1.get(i)<l1.get(i+1))){
                    ans++;
                }
            }
            System.out.println(ans+2);
        }
    }
}
