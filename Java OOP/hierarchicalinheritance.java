class Parentofhierarchical{
    void show(){
        System.out.println("Parent of Hierarchical class");
    }
}
class Child1hierarchical extends Parentofhierarchical{
    void print1(){
        System.out.println("Child 1 of hierarchical inheritance");
    }
}
class Child2hierarchical extends Parentofhierarchical{
    void print2(){
        System.out.println("Child 2 of hierarchical inheritance");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        Child1hierarchical c1 = new Child1hierarchical();
        c1.show();
        c1.print1();

        Child2hierarchical c2 = new Child2hierarchical();
        c2.show();
        c2.print2();
    }
}
