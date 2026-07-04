public class condition{
    public static void main(String[] args){
        int a = 200;
        int b = 33;
        int c = 500;
        //if (a > b && c > a){
        //   System.out.println("Both conditions are correct.");
        //};

        //if (a > b || a > c){
        //    System.out.println("At least one of the conditions is correct.");  
        //};

        if(!(b > a)){
            System.out.println("A not greater than B.");
        };
        
        int age = 25;

        if (age >= 18){
            System.out.println("Allowed");
        }else{
            System.out.println("Not allowed.");
        }


    };
};