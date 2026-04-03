import java.util.Scanner;
import java.util.TreeSet;

public class DoraandSearch {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++)arr[i]=v.nextInt();
            int l=0;
            int r=n-1;

            // we need to find the point where l is not min and max and same for the r
            // if it is true at l or r or both just move them i guess
            TreeSet<Integer>ts=new TreeSet<>();
            for (int i=0;i<n;i++){
                ts.add(arr[i]);  //nlogn
            }

            while (l<r){
                if (vinrar(arr[l],ts)){
                    l++;
                    continue;
                }
                if (vinrar(arr[r],ts)){
                    r--;
                    continue;
                }
                break;
            }
            if (l<r){
                System.out.println((l+1)+" "+(r+1));
            }else{
                System.out.println(-1);
            }
        }
    }
    public static boolean vinrar(int num, TreeSet<Integer>treeSet){
        if (num==treeSet.first()){
            treeSet.remove(num);
            return true;
        }
        if (num==treeSet.last()){
            treeSet.remove(num);
            return true;
        }
        return false;
    }
}
