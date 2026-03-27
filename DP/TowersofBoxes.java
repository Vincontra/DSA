import java.util.Scanner;

public class TowersofBoxes {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int m=v.nextInt();
            int d=v.nextInt();
            int val=d/m;
            val++;
            if (n%val==0){
                System.out.println(n/val);
            }
            else{
                System.out.println((n/val)+1);
            }
        }
    }
}
