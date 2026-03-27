import java.util.*;
public class a {
    public static void main(String[] args){
        Scanner vinay = new Scanner(System.in);
        int t = vinay.nextInt();
        while(t-->0){
            int n = vinay.nextInt();
            String s = vinay.next();
            int oe=0;
            for(char c:s.toCharArray()){
                    if (c=='1'){
                        oe++;
                    }
            }
            int zr=n-oe;
            int ops=0;
            for(int i = 0; i < zr; i++){
                if(s.charAt(i) == '1'){
                    ops++;
                }
            }
            System.out.println(ops);
        }
    }
}
