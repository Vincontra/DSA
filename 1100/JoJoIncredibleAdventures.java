import java.util.Scanner;

public class JoJoIncredibleAdventures {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String s=v.next();
            long n=s.length();
            boolean one=true;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)!='1'){
                    one=false;
                    break;
                }
            }
            if (!one){
                s=s+s;
            }else {
                System.out.println((long)n*n);
                continue;
            }

            long len=0;
            long cnt=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='1'){
                    cnt++;
                }
                else{
                    len=Math.max(len,cnt);
                    cnt=0;
                }
            }
            len=Math.max(len,cnt);
            if (len%2==0){
                System.out.println((len/2)*((len/2)+1));
            }
            else{
                System.out.println(((len+1)/2)*((len+1)/2));

            }
        }
    }
}