import java.util.PriorityQueue;

public class prioqueue1 {
    public static void main(String[] args) {
        PriorityQueue <Integer> a = new PriorityQueue<>();
        a.add(3);
        a.add(11);
        a.add(2);
        a.add(99);

        // for(int i=1;i<=a.size();i++){
        //     System.out.println(a.poll()); //this cannot return full queue as after each iteration an object gets deleted so only 2 spaces printed
        // }

        // int n = a.size();
        // for(int i=1;i<=n;i++){
        //     System.out.println(a.poll()); //sorted
        // }

        //same sorting using while loop
        // while(!a.isEmpty()){
        //     System.out.println(a.poll());
        // }

        //sum of all elements from queue
        int sum=0;
        for(int g:a){
            System.out.println(g);
            sum = sum + g;
        }System.out.println("Sum: "+sum);
    }
}
