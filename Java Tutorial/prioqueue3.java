import java.util.PriorityQueue;
public class prioqueue3{
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        int num = 6;
        for(int i=1;i<=num;i++){
            a.add(i);
        }System.out.println(a); //queue check

        int fact =1;
        while (!a.isEmpty()) {
            fact = fact * a.poll();
        }System.out.println("Factorial of "+num+" is "+fact);
    }
}