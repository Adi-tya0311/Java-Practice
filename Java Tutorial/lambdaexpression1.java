interface Hello{
    void show();
}
public class lambdaexpression1{
    public static void main(String[] args){
        //lambda expressions
        Hello h = () -> System.out.println("Hello! This is being printed with the help of Lambda");
        h.show();
    }
}