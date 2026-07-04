import java.util.*;

public class evennum{
    public static void main(String[] args){

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Print all the even numbers present till n

        for(int i=0; i<= n; i=i+2){
            System.out.println(i);
        }


    }
}