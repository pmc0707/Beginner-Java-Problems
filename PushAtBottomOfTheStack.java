import java.util.*;

//import StackB.Stack;
public class PushAtBottomOfTheStack {
    public static void pushAtBotom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBotom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
         s.push(2);
          s.push(3);
          pushAtBotom(s,4);
          while (!s.isEmpty()) {
            System.out.println(s.pop());
            
          }
    }
}
