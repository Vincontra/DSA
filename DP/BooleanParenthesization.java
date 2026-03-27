import java.util.HashMap;

// User function Template for Java
class BooleanParenthesization {
    static HashMap<String,Integer>hashMap;
    public static void main(String[] args) {
        System.out.println(countWays("T^F|F"));
    }
    static int countWays(String s) {
        hashMap = new HashMap<>();
        return solve(s,0,s.length()-1,true);
    }
    public static int solve(String s,int i,int j,boolean joChahiye){
        if(i>j){
            return 0;
        }
        if(i==j){
            if(joChahiye){
                if(s.charAt(i)=='T'){
                    return 1;
                }else{
                    return 0;
                }
            }
            else{
                if(s.charAt(i)=='F'){
                    return 1;
                }
                else{
                    return 0;
                }

            }
        }
        String key=i+" "+j+" "+joChahiye;
        if (hashMap.containsKey(key)){
            return hashMap.get(key);       // 3 var are changing i j isTrue abhi 3d matrix se accha to ye hai isliye
        }
        int ans=0;
        for(int k=i+1;k<=j-1;k+=2){
            int lt=solve(s,i,k-1,true);
            int rt=solve(s,k+1,j,true);
            int lf=solve(s,i,k-1,false);
            int rf=solve(s,k+1,j,false);

            if(s.charAt(k)=='&'){
                if(joChahiye){
                    ans+=lt*rt;
                }
                else{
                    ans+=lt*rf+lf*rt+lf*rf;
                }
            }
            else if(s.charAt(k)=='|'){
                if(joChahiye){
                    ans+=lt*rt+lf*rt+lt*rf;

                }
                else{
                    ans+=lf*rf;
                }

            }
            else{
                if(joChahiye){
                    ans+=lf*rt+lt*rf;

                }
                else{
                    ans+=lt*rt+lf*rf;
                }

            }

        }
        hashMap.put(key,ans);
        return ans;
    }
}