import java.util. *;

public class whilerev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calc range: ");
        int a = sc.nextInt();
        int i =0;

        while(i<=a){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}