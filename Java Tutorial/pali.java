import java.util.Scanner;
public class pali{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0;
        int rev = 0;
        
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp==rev){
            System.out.println(temp+" is Palindrome.");
        }
        else{
            System.out.println("Number is not palindrome");
        }

        sc.close();

    }
}
