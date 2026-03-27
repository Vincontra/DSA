import java.util.HashMap;
import java.util.Scanner;
public class SwapandDelete {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            String curr=v.next();
            HashMap<Character,Integer>hm=new HashMap<>();
            for (int i=0;i<curr.length();i++){
                if (hm.containsKey(curr.charAt(i))){
                    hm.put(curr.charAt(i),hm.get(curr.charAt(i))+1);
                }
                else{
                    hm.put(curr.charAt(i),1);
                }
            }
            int cntz=hm.getOrDefault('0',0);
            int cntone=hm.getOrDefault('1',0);
            for (int i=0;i<curr.length();i++){
                if (curr.charAt(i)=='0'){
                    if (cntone>0){
                        cntone--;
                    }else{
                        break;
                    }
                }
                if (curr.charAt(i)=='1'){
                    if (cntz>0){
                        cntz--;
                    }else{
                        break;
                    }
                }
            }
            System.out.println(Math.max(cntone,cntz));
        }
    }
}
