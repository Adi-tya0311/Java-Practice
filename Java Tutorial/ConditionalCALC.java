import java.util. *;

public class ConditionalCALC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("***MENU***");
        System.out.println("1) Addition \n2) Subtraction \n3) Multiplication \n4) Division");
        System.out.println("\nEnter a number to choose which action to perform");
        int choice = sc.nextInt();

        System.out.println("You have entered "+choice+" .");
        System.out.println("Please enter number A: ");
        int numA = sc.nextInt();
        System.out.println("Please enter number B: ");
        int numB = sc.nextInt();
        System.out.println("Your selection of number A is"+numA+ " and number B is "+numB);

        switch(choice){
            case 1:
                int sum = numA + numB;
                System.out.println("Addition of "+numA+ " & "+numB+" is "+sum);
                break;
            case 2:
                int difference = numA - numB;
                System.out.println("Subtraction of "+numA+ " &"+numB+ " is"+difference);
                break;
            case 3:
                int multiply = numA * numB;
                System.out.println("Multiplication of "+numA +"&"+numB+" is "+multiply);
                break;
            case 4:
                int divide = numA / numB;
                System.out.println("Division of "+numA+" &"+numB+" is "+divide);
                break;
            default:
                System.out.println("There is an error. Please try again");
                break;
            

        }




        sc.close();
    }
}