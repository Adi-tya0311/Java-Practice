public class methodoverload{
    static int addition(int x, int y){
        return x + y;
    }
    static double addition(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        int sum1 = addition(29,81);
            System.out.println("Sum of integers is "+sum1);

        double sum2 = addition(2.9,7.94);
            System.out.println("Sum of double is "+sum2);
    }
}