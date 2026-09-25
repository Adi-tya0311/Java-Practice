class Parentofmultilevel{
    void print(){
        System.out.println("Parent of multilevel inheritance");
    }
}
class Child1ofmultilevel extends Parentofmultilevel{
    void show(){
        System.out.println("Child 1 of multilevel.");
    }
}
class Child2ofmultilevel extends Child1ofmultilevel{
    void print1(){
        System.out.println("Child 2 of multilevel");
    }
}
public class multilevelinheritance{
    public static void main(String[] args) {
        Child2ofmultilevel c2 = new Child2ofmultilevel();
        c2.print();
        c2.show();
        c2.print1();
    }
}
