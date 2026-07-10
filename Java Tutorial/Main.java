import java.util.Scanner;
public class factori{
    static int facto(int num){
        if(num > 0){
            return num *facto(num-1);
        }
        else{
            return 1;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int x = sc.nextInt();

            int finale = facto(x);
            System.out.println("Factorial of "+x+" is "+finale);
            sc.close();
        }
    
}