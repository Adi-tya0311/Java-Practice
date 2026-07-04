import java.util.*;

public class prime {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num < 2){
            System.out.println("Number is not Prime.");
            isPrime = false;
        }
        else{
            for(int i=2; i <= num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }
        if(isPrime){
            System.out.println("Number is Prime.");
        }else{
            System.out.println("Number aint Prime.");
        }
    }
}
