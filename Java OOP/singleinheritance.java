class Parentofsingle{
    void print(){
        System.out.println("Hello! from parent of single child");
    }
}
public class singleinheritance extends Parentofsingle{
    public static void main(String[] args) {
        singleinheritance s1 = new singleinheritance();
        s1.print();
    }
}