import java.util.Scanner;

public class ExpensiveNumber {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String s = v.next();
            int idx=s.length()-1;
            for (int i=s.length()-1;i>=0;i--){
                if (s.charAt(i)!='0'){
                    idx=i;
                    break;
                }
            }
            int ans=(s.length()-1)-(idx);
            for (int i=0;i<idx;i++){
                if (s.charAt(i)!='0')ans++;
            }
            System.out.println(ans);
        }
    }
}
