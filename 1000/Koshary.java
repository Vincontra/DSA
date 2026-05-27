import java.util.Scanner;

public class Koshary {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int x=v.nextInt();
            int y=v.nextInt();
            if (x%2==1&&y%2==1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
