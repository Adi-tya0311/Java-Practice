// public class inherit1 {
//     public static void main(String[] args) {
        
//         //Inheritance

// class Vehicle{          //Parent Class
//     void start(){
//         System.out.println("Start the vehicle.");
//     }
// }
// class car extends Vehicle{      //Child class- Here child class inherits parents' class details
//     void drive(){
//         System.out.println("Drive the car");
//     }
// }
// public class inherit1 {
//     public static void main(String[] args) {
//         car c = new car();      //Create object of child class (as it has info of both child aswell as parents)
//         c.start();
//         c.drive();
//     }
// }


//Single Inheritance

// class Animal{
//     void eat(){
//         System.out.println("Every animal eats.");
//     }
//     void sleeps(){
//         System.out.println("Every animal sleeps");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// public class inherit1{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.sleeps();
//         d.bark();
//     }
// }

//Multilevel Inheritance - One parent class -> child class -> next child class

// class Employee{
//     void checkout(){
//         System.out.println("Employee perform checkout.");
//     }
// }
// class Manager extends Employee{
//     void task(){
//         System.out.println("Manager assigns tasks.");
//     }
// }
// class SeniorManager extends Manager{
//     void meeting(){
//         System.out.println("Senior manager gets updates via meetings.");
//     }
// }
// public class inherit1{
//     public static void main(String[] args) {
//         SeniorManager sm = new SeniorManager();
//         sm.checkout();
//         sm.task();
//         sm.meeting();
//     }
// }


//Multiple Inheritence- it doesnt work using in Java using class, might work in a different way tho





//Hierarchical Inheritance- One parent class - Multiple child class(in here different object needs to be created for every child class)

// class Employee{
//     void task(){
//         System.out.println("Employee perform daily tasks.");
//     }
// }
// class Developer extends Employee{
//     void development(){
//         System.out.println("Developer makes a website login page.");
//     }
// }
// class Tester extends Employee{
//     void testing(){
//         System.out.println("Tester does testing of login page.");
//     }
// }
// public class inherit1{
//     public static void main(String[] args) {
//         Developer d = new Developer();
//         d.task();
//         d.development();
//         Tester t = new Tester();
//         t.task();
//         t.testing();
//     }
// }


//Hybrid Inheritance- when two or more inheritance are combined

class Grandpa{
    int age = 70;
    String name = "Sushil";
    void getgrandpa(){
        System.out.println("Grandpa name is "+name+" and age is "+age);
    }
}
class Father extends Grandpa{
    int age = 59;
    String name = "Hari";
    void getFather(){
        System.out.println("Father name is "+name+" and age is "+age);
    }
}
class Son extends Father{
    int age = 29;
    String name = "Orry";
    void getSon(){
        System.out.println("Son name is "+name+" and age is "+age);
    }
}
class Daughter extends Father{
    int age = 26;
    String name = "Pooja";
    void getDaughter(){
        System.out.println("Daughter name is "+name+" and age is "+age);
    }
}
public class inherit1{
    public static void main(String[] args) {
        Son s = new Son();
        s.getgrandpa();
        s.getFather();
        s.getSon();
        Daughter d = new Daughter();
        d.getgrandpa();
        d.getFather();
        d.getDaughter();
    }
}

