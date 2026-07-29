import java.util.Scanner;
public class practicecondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a alphabet to check if vowel or not. ");
        // char ch = sc.next().charAt(0);

        //Teacher given code- If i want to print char output then Uppercase letters will also be converted to lowercase
        // ch = Character.toLowerCase(ch);

        // if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
        //     System.out.println("It is a vowel.");
        // }
        // else{
        //     System.out.println("It is not a vowel. ");
        // }

        //My code
        //I like to print output char along so I included all upper and lower case letters
        // if(ch =='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
        //     System.out.println(ch+" is a vowel.");
        // }
        // else{
        //     System.out.println(ch+" is not a vowel.");
        // }

        // System.out.println("Enter a passwordL ");
        // String password = sc.next();

        // if(password.length()>=8){
        //     System.out.println("Valid Password.");
        // }
        // else{
        //     System.out.println("Enter more than 8 characters.");
        // }


        //check login credentials(email id and password) of a specific entity
        System.out.print("Enter email Id: ");
        String email = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();

        if(email.equalsIgnoreCase("BABAKADHABA@gmail.com") && pass.equals("baba123")){
            System.out.println("Login Successful!\nWelcome to the Page!!");
        }
        else{
            System.out.println("You are an imposter.");
        }

        sc.close();
    }
}