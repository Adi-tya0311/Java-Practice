class Grandparentofhybrid{
    void print(){
        System.out.println("Grandparent of hybrid inheritance");
    }
}
class Parentofhybrid extends Grandparentofhybrid{
    void show(){
        System.out.println("Parent of hybrid inheritance class.");
    }
}
class Child1ofhybrid extends Parentofhybrid{
    void print1(){
        System.out.println("Child 1 of hybrid inheritance.");
    }
}
class Child2ofhybrid extends Parentofhybrid{
    void print2(){
        System.out.println("Child 2 of hybrid inheritance.");
    }
}

public class hybridinheritance {
    public static void main(String[] args) {
        Child1ofhybrid c1 = new Child1ofhybrid();
        c1.print();
        c1.show();
        c1.print1();

        Child2ofhybrid c2 = new Child2ofhybrid();
        c2.print();
        c2.show();
        c2.print2();
    }
}
