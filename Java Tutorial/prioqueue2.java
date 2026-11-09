import java.util.PriorityQueue;
public class prioqueue2 {
    public static void main(String[] args) {
        //sum of digits using priority queue(using while loop)
        PriorityQueue<Integer> a = new PriorityQueue<>();
        int num = 6438956;
        int rem;
        while (num>0) {
            rem = num%10;
            a.add(rem);
            num=num/10;
        }

        int sum = 0;
        while(!a.isEmpty()){
            if (a.poll()%2==0) {
                sum = sum + a.poll(); // i believe output is incorrect
            }
        }
        System.out.println("SUm: "+sum);

        // int sum = 0;
        // for (int digit : a) {
        //     if (digit % 2==0) {
        //         System.out.println(digit);
        //         sum = sum + digit;
        //     }
        // }System.out.println(sum);


    }
}




























/*
            while(!a.isEmpty()){
            int digit = a.poll();
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
        }
 */

