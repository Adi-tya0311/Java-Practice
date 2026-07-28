// 1. Age Group Classification
// Write a program to input a person’s age and classify them as:
//  Child (0–12)
//  Teen (13–19)
//  Adult (20–59)
//  Senior Citizen (60 and above)
import java.util.Scanner;


public class newconditional {
        public static void main(String[] args){
        //Solve using Ternary ? :
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // String classify_age = (age>=0 && age<=12)?"Child":(age>12 && age<=19)?"Teen":(age>19 && age<=59)?"Adult":(age>59 && age<=150)?"Senior Citizen":"Invalid Age input";
        // System.out.println("Your age classification states as: "+classify_age);

        //Next Question
//         2. ATM Withdrawal Status
// An ATM system needs to display messages based on the withdrawal amount enteredby theuser. Write a Java program that accepts the withdrawal amount and shows:
//  Amount ≤ 0 → Invalid amount
//  Amount ≤ 10,000 → Transaction successful
//  Amount > 10,000 and ≤ 50,000 → Additional verification required
//  Amount > 50,000 → Withdrawal limit exceeded

            // System.out.print("Enter withdrawal amount: ");
            // int amount = sc.nextInt();
            // String total_amount = (amount<=0)?"Invalid Amount":(amount<=10000)?"Transaction Successful":(amount>=10000 && amount <=50000)?"Additional Verification required":(amount>50000)?"Withdrawal Limit Exceeded":"Invalid Input";
            // System.out.println(total_amount);

//             3. Electricity Bill Calculation
// An electricity board calculates the bill based on monthly unit consumption. Write a Javaprogram that accepts the number of units consumed and calculates the bill using:
//  Up to 100 units → ₹1 per unit
//  101–200 units → ₹2 per unit
//  201–300 units → ₹3 per unit
//  Above 300 units → ₹5 per unit
// Display the total bill amount

        // System.out.println("Enter number of units consumed: ");
        // int units = sc.nextInt();
        // String total_units =(units>0 && units<=100)?"1":(units>100 && units<=200)?"2":(units>200 && units<=300)?"3":(units>300)?"5":"Enter a valid input"; 
        // System.out.println("Rs"+total_units+" per unit");

//         4. Traffic Signal System
// A smart traffic system displays instructions based on signal color. Write a Java program that accepts a signal color and displays:
//  Red → Stop
//  Yellow → Get Ready
//  Green → Go
//  Any other input → Invalid signal

        // System.out.print("Enter signal color: ");
        // String color = sc.next();
        // String output_color =(color.equalsIgnoreCase("RED")?"STOP":
        // (color.equalsIgnoreCase("YELLOW")?"PAUSE":
        // (color.equalsIgnoreCase("GREEN")?"Go":"Invalid color.")));
        // System.out.println(output_color);

//         5. Movie Ticket Pricing System
// A cinema decides ticket prices based on the age of the viewer. Write a Java programthat
// accepts age and displays ticket price:
//  Age < 5 → Free ticket
//  Age 5–12 → ₹100
//  Age 13–59 → ₹200
//  Age ≥ 60 → ₹120

        // System.out.print("Enter Age: ");
        // int age = sc.nextInt();
        // String if_age = (age>0 && age<5)?"Free Ticket":(age>=5 && age <=12)?"Rs100":(age>12 && age<60)?"Rs200":(age>=60 && age<=150)?"Rs120":"Enter a valid input.";
        // System.out.println(if_age);


//         6. Online Shopping Discount System
// An e-commerce website gives discounts based on the total purchase amount. Write a Javaprogram that accepts the bill amount and applies:
//  Amount < ₹1,000 → No discount
//  ₹1,000–₹4,999 → 10% discount
//  ₹5,000–₹9,999 → 20% discount
//  ₹10,000 and above → 30% discount
// Display the final payable amount.

        // System.out.println("Enter bill amount: ");
        // int amount = sc.nextInt();
        // String discount = (amount>0 && amount<1000)?"No discount":(amount>=1000 && amount<4999)?"10% discount":(amount>5000 && amount<10000)?"20% discount":(amount>30000)?"30% discount":"Enter a valid amount.";
        // System.out.println(discount);

//         7. Employee Bonus Calculator
// A company provides yearly bonuses based on years of service. Write a Java programthat
// accepts years of service and displays the bonus:
//  Less than 1 year → No bonus
//  1–3 years → ₹5,000
//  4–6 years → ₹10,000
//  More than 6 years → ₹20,000

        // System.out.print("Enter you years of service: ");
        // int service = sc.nextInt();
        // String bonus = (service>=0 && service<1)?"No bonus":(service>=1 && service<=3)?"Rs5000":(service>=4 && service<=6)?"Rs10000":(service>6)?"Rs20000":"Please enter a valid input";
        // System.out.println(bonus);

//         8. Weather Advisory System
// A weather application displays advisories based on temperature. Write a Java program that accepts temperature and displays:
//  Temperature < 0 → Freezing alert
//  0–15 → Cold weather
//  16–25 → Pleasant weather
//  26–35 → Warm weather
//  Above 35 → Heat wave alert

        // System.out.print("Please enter temperature: ");
        // int temp = sc.nextInt();
        // String advisory = (temp>=0 && temp<=15)?"Cold weather":(temp>15 && temp<=25)?"Pleasant Weather":(temp>25 && temp<=35)?"Warm weather":(temp>35)?"Heatwave alert":"Please enter valid temperature input";
        // System.out.println(advisory);

//         9. Mobile Data Usage Alert
// A telecom company sends alerts based on daily data usage. Write a Java programthat acceptsdata used (in GB) and shows:
//  Usage < 1 GB → Low usage
//  1–2 GB → Normal usage
//  2–3 GB → High usage
//  Above 3 GB → Data limit exceeded

        // System.out.print("Enter data used(in GB): ");
        // int data = sc.nextInt();
        // String usage = (data>=0 && data<1)?"Low Usage":(data>=1 && data<=2)?"Normal Usage":(data>2 && data<=3)?"High Usage":(data>3)?"Data Limit Exceeded":"Enter a valid input";
        // System.out.println(usage);

//         10. Exam Eligibility Checker
// An examination system checks whether a student is eligible to write the exam. Write a Java program that accepts attendance percentage and displays:
//  Attendance ≥ 75% → Eligible for exam
//  Attendance ≥ 60% and < 75% → Eligible with fine
//  Attendance < 60% → Not eligible

        System.out.print("Enter attendance percentage: ");
        float attendance = sc.nextFloat();
        String eligible = (attendance>=75)?"Eligible for exam":(attendance>=60 && attendance<75)?"Eligible with Fine":(attendance>0 && attendance<60)?"Not Eligible":"Enter a valid input";
        System.out.println(eligible);

        sc.close();
        }
}