import java.util.Scanner;
class Required_Length {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        String p=v.next();
        int n=v.nextInt();
        if (p.length()>=n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
