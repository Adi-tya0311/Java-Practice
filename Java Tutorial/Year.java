import java.util.Scanner;

public class Year{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();

        int year = days/365;
        System.out.println("Years: "+year);
        int rem1 = days%365;

        int month = rem1/30;
        System.out.println("Months: "+month);
        int rem2 = rem1%30;

        int week = rem2/7;
        System.out.println("Weeks: "+week);
        int rem3 = rem2%7;

        System.out.println("Days: "+rem3);

        sc.close();
    }
}