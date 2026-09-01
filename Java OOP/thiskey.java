// public class thiskey {
//     public static void main(String[] args) {
        // class Car{
//     String name;
//     Car(){
//         this("Land Rover");
//     }
//     Car(String name){
//         this.name = name;
//     }
//     void display(){
//         System.out.println(name);
//     }
// }
// public class thiskey{
//     public static void main(String[] args){
//         Car c = new Car();
//         c.display();
//     }
// }


//this keyword usage



// class Car{
//     String name;
//     Car(){
//         System.out.println("Default constructor");
//     }
//     Car(String name){
//         this();
//         this.name = name;
//     }
//     void display(){
//         System.out.println(name);
//     }
// }
// public class thiskey{
//     public static void main(String[] args){
//         Car c = new Car("Toyota");
//         c.display();
//     }
// }

//Using this keyword with method
//same as calling directly the method show() we can also use this.show() to do the exactly the same thing

// class Car{
//     String name;
//     Car(){
//         this("Land Rover");
//         this.show();
//         show();
//     }
//     Car(String name){
//         this.name = name;
//     }
//     void display(){
//         System.out.println(name);
//         this.show();
//         show();
//     }
//     void show(){
//         System.out.println("This is show method");
//     }
// }
// public class thiskey{
//     public static void main(String[] args){
//         Car c = new Car();
//         c.display();
//     }
// }


//Use of this & return 

class Phrase{
    String b = "Bada Boom Bada Bang";
    String greet(){
        return this.b;
    }
}
public class thiskey{
    public static void main(String[] args){
        Phrase ph = new Phrase();
        String s = ph.greet();
        System.out.println(s);
    }
}


