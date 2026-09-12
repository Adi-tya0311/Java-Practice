public class stringbasic {
    public static void main(String[] args){
        String name = "ADitya";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String s1= "Hello";
        String s2="Hello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//true, as both references s1 and s2 are accessing string present in stringpool
        String s3 = new String("Hello");//we force created a new string and therefore assigned the string to new area in stringpool
        System.out.println(s1==s3);//false as this checks memory address and not string
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.compareTo(s3));//compares string based on dictionary/alphabetical order
    }
}
