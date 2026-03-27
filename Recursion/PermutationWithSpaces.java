import java.util.Scanner;
public class PermutationWithSpaces {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
//        String ip="ABC";
//        String op=ip.charAt(0)+"";
//        print(ip.substring(1),op);
        String ip="ABC";
        String op="";
        solve(ip,op);



    }
    public static void print(String ip,String op){
        if (ip.length()==0){
            System.out.println(op);
            return;
        }
        print(ip.substring(1),op+"-"+ip.charAt(0));
        print(ip.substring(1),op+ip.charAt(0));

    }
    public static void solve(String ip,String op){
        if (ip.length()==0){
            System.out.println(op);
            return;
        }
        if (ip.length()==1){
            solve(ip.substring(1),op+ip.charAt(0));
        }
        else{
            solve(ip.substring(1),op+ip.charAt(0)+"-");
            solve(ip.substring(1),op+ip.charAt(0));
        }
    }

}
