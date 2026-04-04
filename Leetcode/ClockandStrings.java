import java.util.Scanner;

public class ClockandStrings {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int a=v.nextInt();
            int b=v.nextInt();
            int c=v.nextInt();
            int d=v.nextInt();

            StringBuilder stringBuilder=new StringBuilder();

            for (int i=1;i<=12;i++){
                if (i==a){
                    stringBuilder.append('a');
                }
                if (i==b){
                    stringBuilder.append('b');
                }
                if (i==c){
                    stringBuilder.append('c');
                }
                if (i==d){
                    stringBuilder.append('d');
                }
            }
            String curr=stringBuilder.toString();
            if (curr.equals("adbc")||curr.equals("acbd")||curr.equals("bdac")||curr.equals("bcad")||
            curr.equals("dbca")||curr.equals("dacb")||curr.equals("cadb")||curr.equals("cbda")
            ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }

    }
}
