public class practest2 {
    public static void main(String[] args) {
        //Write a program to implement the Fibonacci series. The length of the series will be provided in the variable 'length'.
        //fibo - 1, 2, 3, 5, 8, 13, 21....
        int length =10;
        int a = 0;
        int b =1;

        for(int i=1;i<=length;i++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
