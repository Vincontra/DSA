import java.util.Scanner;
public class JohnnyandAncientComputer {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            long a=v.nextLong();
            long b=v.nextLong();
            if (a==b){
                System.out.println(0);
            }
            else if (a%b==0||b%a==0){
                if (a>b){
                    long div=a/b; // now this div is power of 2 so 2^n=div  we need to find n :
                    if ((div&(div-1))==0){
                        int n1=0;
                        while (div>1){
                            div=div>>1;
                            n1++;
                        }
                        //now if b is power of 2 then calculate n2 the same way and if not n=0-----> 2^0 kind of
                        int n2=0;
//                        if ((b & (b - 1)) == 0) {
//                            while (b>1){
//                                b=b>>1;
//                                n2++;
//                            }
//                        }
                        System.out.println(((n1-n2)+2)/3);
                    }else{
                        System.out.println(-1);
                    }

                }
                if (b>a){
                    long div=b/a; // now this div is power of 2 so 2^n=div  we need to find n :
                    if ((div&(div-1))==0){
                        int n1=0;
                        while (div>1){
                            div=div>>1;
                            n1++;
                        }
                        //now if b is power of 2 then calculate n2 the same way and if not n=0-----> 2^0 kind of
                        int n2=0;
//                        if ((a & (a - 1)) == 0) {
//                            while (a>1){
//                                a=a>>1;
//                                n2++;
//                            }
//                        }
                        System.out.println(((n1-n2)+2)/3);
                    }else{
                        System.out.println(-1);
                    }
                }
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
