public class swapp{
    public static void main(String[] args){
        int a,b;
        a = 10;
        b = 20;
        
        a = a + b; //a=30, b=20
        b = a - b; //a=30, b=10
        a = a - b; //a=20, b=10

        System.out.println("a is "+a);
        System.out.println("b is "+b);

    }
}