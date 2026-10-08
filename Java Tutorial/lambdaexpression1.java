// interface Hello{
//     void show();
// }
// public class lambdaexpression1{
//     public static void main(String[] args){
//         //lambda expressions
//         Hello h = () -> System.out.println("Hello! This is being printed with the help of Lambda");
//         h.show();
//     }
// }

interface Addition{
    void total(int a,int b,int c);
}
public class lambdaexpression1{
    public static void main(String[] args){
        //lambda expressions
        Addition add = (p,q,r) -> System.out.println("Addition: "+(p+q+r));
        add.total(1, 2, 3);
    }
}