import java.util.Scanner;

public class BinaryCut {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String s=v.next();
            // just cnt the 10 part
//            int ans=1;  // n cuts then ans must n+1 peices
//            for (int i=0;i<s.length()-1;i++){
//                if (s.charAt(i)=='1'&&s.charAt(i+1)=='0'){
//                    ans++;
//                }
//            }
//            System.out.println(ans);

            // 0101 look at this we need to cnt the 10 and 01 as well
            // if we have more than one 01 block we have to keep the largest such box together
            // and the rest is them
            // so cnt the 10 and 01 blocks
            // if you observed we just need to cnt the blocks for the same
            // entity so we will cnt the 00000 blocks or 1111
            // but even if we encounter the 10 atleast one time ans will be tot-1;


            int ans=1;
            int i=0;
            boolean check01=false;
            while (i<s.length()-1){
                if (s.charAt(i)=='0'&&s.charAt(i+1)=='1'){
                    check01=true;
                    ans++;
                }
                else if (s.charAt(i)=='1'&&s.charAt(i+1)=='0'){
                    ans++;
                }
                i++;
            }
            if (check01){
                ans-=1;
            }
            System.out.println(ans);


        }
    }
}
