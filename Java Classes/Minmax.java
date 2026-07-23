import java.util. *;
public class Minmax{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array of 8 digits: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<=n;i++){
            arr[i] = input.nextInt();
        }
        input.close();
    }
}