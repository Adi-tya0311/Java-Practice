public class facto{
    static int num(int x){
        if(x>0){
            return x * num(x-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        int sum = num(5);
        System.out.println("Factorial of 5 is = 5 x 4 x 3 x 2 x 1 => "+sum);
    }
}