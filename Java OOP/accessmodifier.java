// public class accessmodifier{
//     public static void main(String[] args){
        //access modifiers

//Sameclass default
// class Sameclass{
//     int num = 9;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Sameclass same = new Sameclass();
//         same.display();
//     }
// }

//Sameclass -  private
// class Sameclass{
//     private int num = 9;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Sameclass same = new Sameclass();
//         same.display();
//     }
// }

//Sameclass- public
// class Sameclass{
//     public int num = 9;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Sameclass same = new Sameclass();
//         same.display();
//     }
// }

//Sameclass - protected
// class Sameclass{
//     protected int num = 9;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Sameclass same = new Sameclass();
//         same.display();
//     }
// }


//---------------------

//Non-same class  - default
// class Demo{
//     int num2= 50;
//     void show(){
//         System.out.println(num2);
//     }
// }
// class Diffclass{
//     int num = 10;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Diffclass same = new Diffclass();
//         same.display();
//         Demo d = new Demo();
//         d.show();
//     }
// }


//Non-Same class protected
// class Demo{
//     private int num2= 50;
//     private void show(){
//         System.out.println(num2);
//     }
// }
// class Diffclass{
//     int num = 10;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {        // error: show() has private access in Demo
//         Diffclass same = new Diffclass();
//         same.display();
//         Demo d = new Demo();
//         d.show();   //This method is not visible
//     }
// }

//Non-Class Protected
// class Demo{
//     protected int num2= 50;
//     void show(){
//         System.out.println(num2);
//     }
// }
// class Diffclass{
//     int num = 10;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Diffclass same = new Diffclass();
//         same.display();
//         Demo d = new Demo();
//         d.show();   
//     }
// }


//Non-Class Protected
// class Demo{
//     protected int num2= 50;
//     void show(){
//         System.out.println(num2);
//     }
// }
// class Diffclass{
//     int num = 10;
//     void display(){
//         System.out.println(num);
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Diffclass same = new Diffclass();
//         same.display();
//         Demo d = new Demo();
//         d.show();   
//     }
// }


//Parent-child -private
// class Parent{
//     private int num2= 50;
// }
// class Child extends Parent{
//     void show(){
//         System.out.println(num2);//The field Parent.num2 is not visible
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Child c1 = new Child();
//         c1.show();
//     }
// }


//Parent-child -protected
// class Parent{
//     protected int num2= 50;
// }
// class Child extends Parent{
//     void show(){
//         System.out.println(num2);//Works fine, as protected works in inheritance
//     }
// }
// public class accessmodifier{
//     public static void main(String[] args) {
//         Child c1 = new Child();
//         c1.show();
//     }
// }


class Parent{
    protected int num2= 50;
}
class Child extends Parent{
    void show(){
        System.out.println(num2);//Works fine, as protected works in inheritance
    }
}
public class accessmodifier{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
    }
}


//Im unable to import from different package/folder so I wont be able to do this in vscode
