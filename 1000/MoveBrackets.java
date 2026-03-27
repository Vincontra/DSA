import java.util.*;
public class MoveBrackets {
    public static void main(String args[]){
        Scanner v=new Scanner(System.in);
        int t=v.nextInt();
        while (t-->0){
            int n=v.nextInt();
            String curr=v.next();
            Stack<Character>s1=new Stack<>();
            s1.push(curr.charAt(0));
            for (int i=1;i<curr.length();i++){
                char c=curr.charAt(i);
                if (!s1.isEmpty()&&c==')'&&s1.peek()=='('){
                    s1.pop();
                }
                else{
                    s1.push(c);
                }
            }
            System.out.println(s1.size()/2);
        }
    }
}
