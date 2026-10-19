import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        // ArrayList<String> passenger = new ArrayList<>(Arrays.asList("ROhit","Virat","Gautam","Vijay"));
        Vector<Integer> seat = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Available seats: " + seat);
            System.out.println("Enter seat number to book (0 to exit):");
            int book = sc.nextInt();
            if(book == 0){
                System.out.println("Exiting seat booking.");
                break;
            }
            if(seat.contains(book)){
                seat.remove(Integer.valueOf(book));
                System.out.println("Seat "+book+" booked successfully");
            }else{
                System.out.println("Seat "+book+ " is already booked or invalid");
            }
        }
        System.out.println("Available seats: "+seat);
        sc.close();
    }
}
