public class Reverse{
    public static void main(String[] args){
        String s1 = ("Baba ka dhaba");
        String rev = new StringBuilder(s1).reverse().toString(); 
        System.out.println("Before: "+s1);
        System.out.println("After: "+rev);

    }
}