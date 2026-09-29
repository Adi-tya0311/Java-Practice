import java.util.Scanner;

public class excephand1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //throw keyword
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if(age>=18 && age<=100){
                System.out.println("Entry allowed.");
            }else{
                throw new Exception("Not allowed");     //Allow any kind of exception here.
            }
        } catch (Exception e) {         
            System.out.println("Program continues after exception. "+e);
        }

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if(marks>=35 && marks <=100){
                System.out.println("Congratulations, you have passed.");
            }else{
                throw new Exception("Failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }System.out.println("Program continues after exception.");

        sc.close();
    }
}
