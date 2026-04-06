import java.util.Scanner;

public class PrinzessinderVerurteilung {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            String s=v.next();
            String ans="";
            StringBuilder sb=new StringBuilder("a");

            while (true){
                String curr=sb.toString();
                if (!s.contains(curr)){
                    ans=curr;
                    break;
                }

                int i=sb.length()-1;
                while (i>=0&&sb.charAt(i)=='z'){
                    sb.setCharAt(i,'a');
                    i--;
                }
                if(i>=0){
                    sb.setCharAt(i, (char)(sb.charAt(i)+1));
                }
                else{
                    sb.insert(0, 'a');
                }

            }
            System.out.println(ans);
        }
    }
}
