import java.util.Scanner;
public class newswap {
    public static void main(String[] args){
        //Bitwise Operator - ExOR = ^
        //T - F = T
        //F - T = T
        //T - T = F
        //F - F = F
        // System.out.println(3^9);

        //Swapping using 3rd variable
        // int a = 10;
        // int b = 40;
        // int c;
        // c = a;//C=10
        // a = b;//A=40
        // b = c;//B=10
        // System.out.println("A: "+a+"\nB: "+b+"\nC: "+c);

        //Swapping without using 4rd variable
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a= sc.nextInt();
        System.out.print("Enter number B: ");
        int b= sc.nextInt();
        // //a = 80, b = 120
        // a = a + b; //a = 200
        // b = a - b; //b = 80
        // a = a - b; //a = 120
        // //We can interchange the + sign with * and - sign with / and expect the same output
        // a = a*b; //a = 5*10 = 50
        // b = a/b; //b = 50/10 = 5
        // a = a/b; //a = 50/5 = 10

        //Using Bitwise ^ operator for same
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("\nAfter swap \nNumber A: "+a+"\nNumber B: "+b);

        sc.close();
    }
}
