import java.util.Arrays;
import java.util.Scanner;

public class AssemblyviaMinimums {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int s=(n*(n-1))/2;
            long arr[]=new long[s];
            for (int i=0;i<s;i++){
                arr[i]=v.nextLong();
            }
            Arrays.sort(arr);

            long ans[]=new long[n];
            int idx=0;
            int id=0;
            while (n>1){
                ans[idx]=arr[id];
                id=id+n-1;
                n--;
                idx++;
            }
            ans[idx]=(int)1e9;

            for (int i=0;i< ans.length;i++){
                System.out.print(ans[i]+" ");
            }

            System.out.println();
        }
    }
}