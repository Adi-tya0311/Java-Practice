import java.util.Scanner;
public class harshad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem = 0;
        int sum =0;
        int temp = num;

        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        if(temp%sum==0){
            System.out.println("Harshad number: "+rem);
        }
        else{
            System.out.println("NOt harshad number: "+rem);
        }



        sc.close();
    }

}
