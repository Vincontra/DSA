import java.util.Scanner;
public class PermutationCaseChange {
    public static void main(String[] args) {
       // Scanner v=new Scanner(System.in);
        String ip="a1b2";
        String op="";
        print(ip,op);

    }
    public static void print(String ip,String op){
        if (ip.length()==0){
            System.out.println(op);
            return;
        }
        if (ip.charAt(0)-'0'>=0&&ip.charAt(0)-'0'<=9){
            print(ip.substring(1),op+ip.charAt(0));
        }else{
            print(ip.substring(1),op+ ip.toLowerCase().charAt(0));
            print(ip.substring(1), op+ ip.toUpperCase().charAt(0));
        }
    }
}
