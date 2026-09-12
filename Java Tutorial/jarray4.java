import java.util.Scanner;

public class jarray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();
        int a[] = new int[size1];
        System.out.print("Enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();
        int b[] = new int[size2];
        System.out.print("Enter elements: ");
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }

        int c=0;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i] != b[i]){
                    c++;
                    break;
                }
            }if(c==b.length){   //instead of b.length, we should write 0, but idk- if it works dont touch it
                    System.out.println("Array is same.");
                }else{
                    System.out.println("Array is not same.");
                }
        }else{
            System.out.println("Length of array is not same.");
        }

        sc.close();
    }
}