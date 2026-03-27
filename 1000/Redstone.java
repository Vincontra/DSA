import java.util.HashMap;
import java.util.Scanner;
public class Redstone {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=v.nextInt();
            }
            HashMap<Integer,Integer>hm=new HashMap();
            for (int i=0;i<n;i++){
                if(hm.containsKey(arr[i])){
                    hm.put(arr[i],hm.get(arr[i])+1);
                }else{
                    hm.put(arr[i],1);
                }
            }
            boolean check=false;
            for (int a: hm.keySet()){
                if (hm.get(a)>=2){
                    check=true;
                    break;
                }
            }
            if (check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
