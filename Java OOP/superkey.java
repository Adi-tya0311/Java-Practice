//super keyword
abstract class Payment{
    Payment(){
        System.out.println("This is super class");
    }
    abstract void pay();
}
class Googlepay extends Payment{
    void pay(){
        System.out.println("Payment received");
    }
    Googlepay(){
        super();
        System.out.println("This is child class constructor");
    }
}
public class superkey {
    public static void main(String[] args) {
        Googlepay g = new Googlepay();
        g.pay();
        
    }
}
