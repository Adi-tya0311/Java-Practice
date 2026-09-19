public class stringrev {
    public static void main(String[] args) {
        //Check if string is palindrome or not
        String str = "MADAM";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }System.out.println("Reverse: "+rev);
        if(str.equals(rev)){
            System.out.println("Palindrome.");
        }else{System.out.println("Not Palindrome.");}


        //String a = "aaabbc";
        //format = a2b1c o/p
        String st = "aaabbc";
        String result="";
        int counter = 1;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)){
                counter++;
            }else{
                result= result+ st.charAt(i)+Integer.toString(counter);
                counter=1;
            }        
        }result =result+ st.charAt(st.length() - 1) + Integer.toString(counter);
        System.out.println("Result: "+result);

        // String s1 = "aaabbc";
        // String result1="";
        // int counter1=0;
        // for(int i=0;i<st.length();i++){
        //     if(st.charAt(i)==st.charAt(i+1)){
        //         counter1++;
        //     }
        // }
    }
}
