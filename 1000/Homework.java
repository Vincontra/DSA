import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            String curr=v.next();
            int a=v.nextInt();
            String tobeappend=v.next();
            String decide=v.next();
            StringBuilder front=new StringBuilder();
            StringBuilder back=new StringBuilder();
            for (int i=0;i<tobeappend.length();i++){
                if (decide.charAt(i)=='D'){
                    back.append(tobeappend.charAt(i));
                }else if (decide.charAt(i)=='V'){
                    front.append(tobeappend.charAt(i));
                }
            }
           // System.out.println(front.toString());
            System.out.println(front.reverse().toString()+curr+back.toString());
        }
    }
}
