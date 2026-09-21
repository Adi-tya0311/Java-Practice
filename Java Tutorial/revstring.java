public class revstring{
    public static void main(String[] args) {
        String str = "madam";
        String rev="";
        int i=str.length()-1;
        do{
            rev=rev+str.charAt(i);
            i--;
        }while(i>=0);
        if(rev.equals(str)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not");
            }
    }
}