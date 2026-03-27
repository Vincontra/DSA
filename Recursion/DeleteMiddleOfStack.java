import java.util.Stack;
public class DeleteMiddleOfStack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.push(4);
        s1.push(5);
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
        s1.push(3);
        s1.push(2);
        s1.push(1);
        s1.push(4);
        s1.push(5);
        System.out.println("==========================");
        int size=s1.size();
        delete(s1,size);
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
    public static void delete(Stack<Integer>s1,int tot){
        if (s1.size()==(tot/2)+1){
            s1.pop();
            return;
        }
        int curr=s1.pop();
        delete(s1,tot);
        s1.push(curr);
    }
}
