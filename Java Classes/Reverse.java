public class Reverse{
    public static void main(String[] args){
        String a = ("String is a type of string");

        String reverse = new StringBuilder(a).reverse().toString();
        System.out.println("Before: "+a);
        System.out.println("After: "+reverse);
    }
}