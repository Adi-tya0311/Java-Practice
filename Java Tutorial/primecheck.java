import java.util.Scanner;

public class primecheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        if(x <= 1){
            System.out.println("The number "+x+ " is not prime.");
        }
        else{
            boolean isPrime = true;
            
            for(int i=2;i<x-1;i++){
                if(i%x-1 == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The number "+x+ " is prime.");
            }
            else{
                System.out.println("The number "+x+ " is not prime.");
            }
        }
        sc.close();
    }
}