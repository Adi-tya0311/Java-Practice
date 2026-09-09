//Construct a Java program to display the first 'm' multiples of 'n' (where 'm' and 'n' are predefined variables).
import java.util.Scanner;
public class multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter how many multiples would you like: ");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=i;j<=m;j++){
                System.out.println(j*n);
            }
        }

        sc.close();
    }
}


