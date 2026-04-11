import java.util.Scanner;
public class WordOfMouth {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        long n=v.nextLong();
        String A=v.next();
        String B=v.next();
        int lcp=0;  // longest common pfx
        int i=0;
        while (i<A.length()&&i<B.length()&&A.charAt(i)==B.charAt(i)){
            lcp++;
            i++;
        }
        int tl=0;
        if (A.length()-lcp>0){
            tl+=A.length()-lcp;
        }
        if (B.length()-lcp>0){
            tl+=B.length()-lcp;
        }

        if (tl<=n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
