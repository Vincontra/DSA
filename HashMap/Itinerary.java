import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Itinerary {
    public static void main(String args[]) {
//      Scanner v=new Scanner(System.in);
        HashMap<String,String>hm=new HashMap<>();
        hm.put("Mumbai","Delhi");
        hm.put("Delhi","Goa");
        hm.put("Goa","Chennai");
        hm.put("Chennai","Bengaluru");
        HashSet<String>hs=new HashSet<>();
        for (String key:hm.keySet()){
            hs.add(hm.get(key));
        }
        String start="";
        for (String key:hm.keySet()){
             if (!hs.contains(key)){
                 start=key;
                 break;
             }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        sb.append(start);
        sb.append("->");
        while (i<hm.size()){
            sb.append(hm.get(start));
            if(i!=hm.size()-1){
                sb.append("->");
            }
            if(hm.containsKey(start)){
                start=hm.get(start);
            }else{
                break;
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
