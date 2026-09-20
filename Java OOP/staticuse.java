//Use of static
class Hefshine{
    int student_id;
    String student_name;
    static String classname = "Hefshine";
    Hefshine(int student_id,String student_name){
        this.student_id = student_id;
        this.student_name = student_name;
    }
    Hefshine(){
        System.out.println("");
    }
    void display(){
        System.out.println(student_id+" "+student_name+" "+classname);
    }
}
public class staticuse {
    public static void main(String[] args){
        // Hefshine s1 = new Hefshine();
        // Hefshine s2 = new Hefshine();
        // Hefshine s3 = new Hefshine();
    }
}
