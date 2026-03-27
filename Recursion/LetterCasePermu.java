import java.util.*;
public class LetterCasePermu {
    public static List<String> letterCasePermutation(String s) {
        String ip=s;
        String op="";
        List<String>ans=new ArrayList<>();
        print(ip,op,ans);
        return ans;

    }
    public static void print(String ip,String op,List<String>ans){
        if (ip.length()==0){
            //System.out.println(op);
            ans.add(op);
            return;
        }
        if (ip.charAt(0)-'0'>=0&&ip.charAt(0)-'0'<=9){
            print(ip.substring(1),op+ip.charAt(0),ans);
        }else{
            print(ip.substring(1),op+ ip.toLowerCase().charAt(0),ans);
            print(ip.substring(1), op+ ip.toUpperCase().charAt(0),ans);
        }
    }

    public static void main(String[] args) {
        List<String>ans=letterCasePermutation("a1b2");
        for (int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}