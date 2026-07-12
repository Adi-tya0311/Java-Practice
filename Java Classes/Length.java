public class Length{
    public static void main(String[] args){
        String a = ("Freddy Fazbear");
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        
        String reversed = ("");
        for(int i=a.length()-1;i>=0;i--){
            reversed = reversed + a.charAt(i);
        }
        System.out.println("Reverse of string is: "+reversed);
        

    }
}