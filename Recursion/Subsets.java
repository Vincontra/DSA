import java.util.Scanner;
public class Subsets {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        String ip="aac";
        String op=" ";
        solve(ip, op);

        //System.out.println('1'-'0');
    }
    public static void solve(String ip,String op){
        if (ip.length()==0){
            System.out.println(op);
            return;
        }
        solve(ip.substring(1),op+ip.charAt(0));  // output me lena hai curr ko
        solve(ip.substring(1),op);// nhi lena hai
        // input me curr char ko bhul jao hence charAt 1 se end tak
    }
}
