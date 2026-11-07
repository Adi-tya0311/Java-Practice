import java.util.Stack;
public class stack1{
    public static void main(String[] args) {
        //stack
        Stack<Integer> s = new Stack<>();
        s.add(9);
        s.push(5);
        s.addElement(3);
        s.add(33);
        s.push(null);
        System.out.println(s);
        //---------------
        s.pop();
        System.out.println(s);
        System.out.println(s.search(9)); //currently there are 2 elements- 9 ,33 ,5. 
        //As per stack we put elements on top of each other and counter from behind so, 9 is on 2nd position
        System.out.println(s.search(1));
        System.out.println(s.search(null));
        System.out.println(s.peek());//Returns top element without removing it

    }
}