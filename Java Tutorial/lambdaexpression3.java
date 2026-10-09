interface stringprogram{
    void check(String x);
}
public class lambdaexpression3 {
    public static void main(String[] args){
        /*Check if a string is empty using lambda Write a Java program to implement a lambda
expression to check if a given string is empty */
        stringprogram s = (x) -> {
            if(x.isEmpty()){
                System.out.println("String is empty");
            }else{
                System.out.println("String not empty");
            }
        };s.check("String");
    }
}
