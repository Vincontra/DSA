import java.util.*;
class ScarambleStrings{
    public boolean isScramble(String s1, String s2) {
        String a=s1;
        String b=s2;
        if (a.length()!=b.length()){
            return false;
        }
        else{
            HashMap<String,Boolean>hm=new HashMap<>();
            return (solve(a,b,hm));
        }

    }
    public static boolean solve(String a, String b, HashMap<String,Boolean>hm){
        if (a.compareTo(b)==0){
            return true;
        }
        if (a.length()<=1){
            return false;
        }
        String key=a+"_"+b;
        if (hm.containsKey(key)){
            return hm.get(key);
        }
        int n=a.length();
        boolean flag=false;
        for (int k=1;k<=n-1;k++){
            boolean cond1=solve(a.substring(0,k),b.substring(n-k),hm)&&solve(a.substring(k), b.substring(0,n-k),hm);
            boolean cond2=solve(a.substring(0,k),b.substring(0,k),hm)&&solve(a.substring(k), b.substring(k),hm);
            if (cond1||cond2){
                flag=true;
                break;
            }
        }
        hm.put(key,flag);
        return flag;
    }

    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        ScarambleStrings o=new ScarambleStrings();
        String a=v.next();
        String b=v.next();
        System.out.println(o.isScramble(a,b));
    }
}