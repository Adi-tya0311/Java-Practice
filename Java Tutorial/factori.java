import java.util.Scanner;

public class factori{
    static int recu(int num){
        if(num>0){
            return num * recu(num-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int finale = recu(x);
        System.out.println("The factorial of "+x+" is "+finale);

        sc.close();
    }
}