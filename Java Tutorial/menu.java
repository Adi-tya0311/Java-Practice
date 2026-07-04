import java.util.*;

public class menu{
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int n;
                // major correction- Both inputs should be inside the do while loop, only then will the loop run perfectly
                //What changed-->
                //Now n gets updated every loop
                //No break, so loop continues naturally
                //User controls when to stop by entering 0
        do{
            System.out.print("Enter 0 or 1:");
            n = sc.nextInt();

                if (n == 1){
                    System.out.println("Enter you total marks(out of 100): ");
                    int marks = sc.nextInt();

                    if (marks >= 90){
                        System.out.println("Ts is Good");
                    }
                    else if (marks >= 60 && marks <=89){
                        System.out.println("Ts is good, yay we rockin");
                    }
                    else if (marks >= 40 && marks <= 59){
                        System.out.println("Ts is best we passed ts");
                    }
                    else{
                        System.out.println("Hardluck buddy we need more than that");
                    }
                
            
                }
            }while(n != 0);
    }
}