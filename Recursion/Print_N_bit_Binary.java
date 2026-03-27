import java.util.*;
public class Print_N_bit_Binary {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int o=1;
        int z=0;
        String op="1";
        print(o,z,op,n);
    }
    public static void print(int one,int zero,String op,int n){
        if (zero>one){
            return;
        }
        if (one+zero==n){
            System.out.println(op);
            return;
        }
        int o=one+1;
        int z=zero+1;
        print(o,z-1, op+"1", n);
        print(o-1,z,op+"0",n);
    }
}
