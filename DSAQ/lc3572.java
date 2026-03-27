import java.util.*;
class Solutio {

    public int maxSumDistinctTriplet(int[] x, int[] y) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<x.length;i++){
            if(hm.containsKey(x[i])){
                if(hm.get(x[i])<y[i]){
                    hm.put(x[i],y[i]);
                }
            }else{
                hm.put(x[i],y[i]);
            }
        }
        int ans=-1;
        if(hm.size()<3){
            return ans;

        }else{
            for(int a:hm.keySet()){
                l1.add(hm.get(a));
            }
            Collections.sort(l1,Collections.reverseOrder());

        }
        return l1.get(0)+l1.get(1)+l1.get(2);
    }

    public static void main(String[] args) {


    }
}
