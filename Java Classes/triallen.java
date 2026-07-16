public class triallen{
    public static void main(String[] args){
        String a = ("Five Nights at Freddy's Part two. ");

        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.charAt(9));

        String reversed = ("");
        for(int i=a.length()-1;i>=0;i--){
            reversed = reversed + a.charAt(i);
        }
        System.out.println("Reversed String is: "+reversed);
    }
}