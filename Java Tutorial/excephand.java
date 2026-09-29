class AgeException extends Exception{       //Here we created child class of custom exception and keeping Exception as parent class
    AgeException(String str){
        super(str);                         //Here we added super to let Parent class know about str.
    }
}
public class excephand {
    public static void main(String[] args) {
        //Self created exception
        try {
            int age =12;
            if(age>18){
                System.out.println("Allowed to vote");
            }else{
                throw new AgeException("Not enough age.");  //Here we created custom exception
            }
        } catch (AgeException e) {
            System.out.println(e);
        }
        System.out.println("Code continues after exception.....");
    }
}
