import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Course{
    //declaration
    String courseid, coursename;
    int capacity;
    List<String> RegisteredStudents;
    Queue<String> WaitingList;

    //constructor
    Course(String courseid, String coursename, int capacity){
        this.courseid=courseid;
        this.coursename=coursename;
        this.capacity=capacity;
        this.RegisteredStudents=new ArrayList<>();
        this.WaitingList= new LinkedList<>();

    }

    //toString to print object data
    public String toString(){
        return courseid+" "+coursename+" "+capacity+" "+" |Registered| "+RegisteredStudents.size()+"/"+capacity;
    }

}

public class listqueue1 {
    static Scanner sc = new Scanner(System.in);
    static Map<String,Course> Courses = new HashMap<>();
    public static void main(String[] args) {
        loadcourses();
        int choice;
        do {
            System.out.println("\n----College Course Registration----");
            System.out.println("1) Register Students\n2) Drop Students\n3) View Courses\n4) View Waitinglist\n5) Total Registered Students\n6)Exit.");
            System.out.println("Enter choice: ");
            choice = sc.nextInt(); sc.nextLine();


            switch (choice) {
                case 1->RegisteredStudents();
                case 2 ->dropstudent();
                case 3 ->viewcourses(); 
                case 4 ->viewwaitinglist();
                case 5 ->totalRegisteredStudents();
                case 6 ->System.out.println("Goodbye");
                default-> System.out.println(("Invalid choice"));
                    //break;
            }

        } while (choice!=6);



    }
        //end of main
    static void loadcourses(){
        Courses.put("100",new Course("100", "Java Fullstack", 2));
        Courses.put("101",new Course("101", "Python Datascience", 1));
        Courses.put("102",new Course("102", " Devops ", 1));
    }

    static void RegisteredStudents(){
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter course id: ");
        String courseid = sc.nextLine();

        Course course = Courses.get(courseid);
        if(course == null){
            System.out.println("COurse not found");
            return;
        }

        if(course.RegisteredStudents.contains(name)||course.WaitingList.contains(name)){
            System.out.println("Student already registered or in WaitingList");
            return;
        }
        if(course.RegisteredStudents.size()<course.capacity){
            course.RegisteredStudents.add(name);
            System.out.println("Student registered in course");
        }else{
            course.WaitingList.add(name);
            System.out.println("Course full. Student addded to WaitingList");
        }
    }

    static void dropstudent(){
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter course id: ");
        String courseid = sc.nextLine();

        Course course = Courses.get(courseid);
        if(course == null){
            System.out.println("Course not found. ");
            return;
        }
        if(course.RegisteredStudents.remove(name)){
            System.out.println("Student removed");
            if(!course.WaitingList.isEmpty()){
            String next = course.WaitingList.poll();
            course.RegisteredStudents.add(next);
            System.out.println("WaitingListed student"+next+"added to course");
            }
        }else if (course.WaitingList.remove(name)){
            System.out.println("Student removed from WaitingList.");
        } else {
            System.out.println("Student not found in course.");
        }
    }

    static void viewcourses(){
        System.out.println("\n----Courses----");
        Courses.values().forEach(System.out::println);
    }

    static void viewwaitinglist(){
        System.out.print("Enter course id: ");
        String courseid = sc.nextLine();

        Course course = Courses.get(courseid);
        if(course != null){
            System.out.println("WaitingList for "+course.coursename+":");
            if(course.WaitingList.isEmpty()){
                System.out.println("No students");
            }else{
                course.WaitingList.forEach(System.out::println);
            }
        }else{
                System.out.println("Course not found");
            }
        
    }
        
    static void totalRegisteredStudents() {
        int total = 0;

        System.out.println("\n---- Registered Students by Course ----");
        for (Course course : Courses.values()) {
            int count = course.RegisteredStudents.size();
            total += count;
            System.out.println(course.coursename + " (" + course.courseid + "): " + count);
        }

        System.out.println("Total registered students: " + total);
    }

}
