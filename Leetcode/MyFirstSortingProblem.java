import java.util.Scanner;

public class MyFirstSortingProblem {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int x=v.nextInt();
            int y=v.nextInt();
            System.out.println(Math.min(x,y)+" "+Math.max(x,y));
        }

    }
}
