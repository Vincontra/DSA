import java.util.*;
public class Vinay {
    public static void main(String[] args) {
        String []word={"apple","apply","banana","bandit"};
        int k=2;
        System.out.println(prefixConnected(word,k));
    }
    public static int prefixConnected(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String c=words[i];
            String K=c.substring(0,k);
            if(hm.containsKey(k)){
                hm.put(K,hm.getOrDefault(K,0)+1);
            }else{
                hm.put(K,1);
            }
        }

        int ans=0;
        for(String K:hm.keySet()){
            if(hm.get(K)>=2){
                ans++;
            }
        }
        return ans;
    }
}
