import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist1 {
    public static void main(String[] args) {
        // LinkedList<Integer> a= new LinkedList<>(Arrays.asList(10,20,30,40));
        // LinkedList<Integer> b = new LinkedList<>(Arrays.asList(50,60,70,80));
        // LinkedList<Integer> c = new LinkedList<>();
        // c.addAll(a);
        // c.addAll(b);
        // System.out.println(c);

        LinkedList<String> student = new LinkedList<>(Arrays.asList("Aditya","Raj","Abhinav","Rohan","Tanmay"));
        
        @SuppressWarnings("unused")
        LinkedList<String> present = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        LinkedList<String> absent = new LinkedList<>();
        System.out.println("Please enter number of absent student name: ");
        int absentnum = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<absentnum;i++){
            System.out.println("Enter students name: ");
            String name = sc.nextLine();
            absent.add(name);
        }

        System.out.println("Final List: ");
        for(String names: student){
            if(absent.contains(names)){
                System.out.println(names+" : Absent");
            }else{
                System.out.println(names+" :Present");
            }
        }
        sc.close();
    }
}