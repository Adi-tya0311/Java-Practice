public class math{
    public static void main(String[] args){
        //max
        System.out.println(Math.max(10,15));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-3.9));
        System.out.println(Math.abs(-44.01));

        //random number 
        int randomNum = (int)(Math.random()* 101);
        System.out.println(randomNum);

        int abc = 11;
        int pqr = 59;
        boolean output = abc > pqr;
        System.out.println("Is abc bigger than pqr? =>"+output);

        System.out.println(10 > 9);
    };
};