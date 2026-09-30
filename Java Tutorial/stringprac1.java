public class stringprac1 {
    public static void main(String[] args) {
        // String str = "Hello";
        // for(int i=0;i<str.length();i++){
        //     char ch= str.charAt(i);
        //     ch = (char)(ch+1);
        //     System.out.print(ch);
        // }

        // String s = "123456789";
        // String regex ="\\d+";
        // if(s.matches(regex)){
        //     System.out.println("Valid");
        // }else{
        //     System.out.println("Invalid");
        // }

        // StringBuffer s1= new StringBuffer("hello world");
        // s1.reverse();
        // System.out.println(s1);
        

        String sentence = "THis is a simple test";
        String s[] = sentence.split(" ");
        for(int i=0;i<s.length;i++){
            //System.out.println(s[i]);
            StringBuffer sb = new StringBuffer(s[i]);
            System.out.println(sb.reverse());
        }
        char ch = 'a';
        System.out.println(ch);
    }
}
