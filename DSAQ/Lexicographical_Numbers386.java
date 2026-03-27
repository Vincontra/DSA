import java.util.ArrayList;
import java.util.Scanner;
public class Lexicographical_Numbers386 {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        ArrayList<Integer>l1=new ArrayList<>();
        int n=v.nextInt();
        solve(l1,n);
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
    }
    public static void solve(ArrayList<Integer>l1,int  n){
        int curr=1;
        for (int i=0;i<n;i++){
            l1.add(curr);
            if(curr*10<=n){
                curr*=10;
            }
            else{
                while (curr%10==9||curr>=n){
                    curr/=10;
                }
                curr++;
            }
        }
    }
}
