// public class typecastclass {
//     public static void main(String[] args) {
        // class typecastclass{
//     int add(int a, int b){
//         return a+b;
//     }
//     byte subtract(byte a,byte b){
//         return (byte)(a-b);         //we have to declare and typecastclass the variables as byte, because their default datatype is int.
//     }
//     String division(short a,short b){
//         return "Division: "+(a/b);
//     }
// }
// public class typecastclass{
//     public static void main(String[] args){
//         typecastclass type = new typecastclass();
//         int ad = type.add(2,5);
//         System.out.println("Addition of integers: "+ad);

//         byte bt = type.subtract((byte)18,(byte)4); //We have to declare&typecastclass input data present here to byte as even their default type is int
//         System.out.println("Subtraction of integers: "+bt);

//         // String sh = type.division((short)98,(short)12);
//         System.out.println(type.division((short)98,(short)12));
//     }
// }


// class redundant{
//     void show(){
//         System.out.println("Show");
//         get();          //instead of calling the method separately we call them inside one method
//         set();
//     }
//     void get(){
//         System.out.println("get");
//     }
//     void set(){
//         System.out.println("set");
//     }
// }
// public class typecastclass{
//     public static void main(String[] args){
//         redundant red = new redundant();
//         red.show();
//     }
// }


class test1{
    // int b;
    // String n;
    // float f;
    // String ad;
    String z;
    void get(int a,String name, float marks,String addr){
        // b=a;
        // n=name;
        // f=marks;
        // ad=addr;
        z = a+name+marks+addr;
    }                           //We used one method for assigning of variable and another method to print them
    void show(){
        // System.out.println(b+" "+n+" "+f+" "+" "+ad+" ");
        System.out.println(z);
    }
    
}
public class typecastclass{
    public static void main(String[] args){
        test1 t1 = new test1();
        t1.get(1,"\tBinod\t",45.9f,"\tViman Nagar");
        t1.show();
    }
}

