import java.util.*;
public class TowerOfHanoi {
    static int cnt=0;
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int src=1;
        int helper=2;
        int dest=3;
        int noOfPlates=v.nextInt();
        print(src,dest,helper,noOfPlates);
        System.out.println(cnt);
    }
    public static void print(int src,int dest,int helper,int n) {
//        cnt++;
        if (n==1) {
            System.out.println("Moving Plate "+n+" from src "+src+" to destination "+dest);
            return;
        }
        print(src,helper, dest,n-1);
        System.out.println("vinay Moving Plate "+n+" from "+src+" to destination "+dest);
        print(helper,dest,src,n-1);
    }
}
