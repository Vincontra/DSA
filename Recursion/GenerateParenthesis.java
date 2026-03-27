import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        List<String>ans=new ArrayList<>();
        int o=n-1;
        int c=n;
        String op="(";
        solve(ans,o,c,op);
    }
    public static void solve(List<String>ans,int o,int c,String op){
        if (o==0&&c!=0){
            while (c!=0){
                op=op+')';
                c--;
            }
            //System.out.println(op);
            ans.add(op);
            return;
        }
        else if (o==1&&c==1){
            op=op+"()";
            o-=1;
            c-=1;
            //System.out.println(op);
            ans.add(op);
            return;
        }
        else if (o>c){
            return;
        }
        int open=o-1;
        int close=c-1;
        solve(ans,open,c,op+'(');
        solve(ans,o,close, op+')');
    }
}
