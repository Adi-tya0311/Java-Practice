import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        //Selection Sort
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements in array: ");
        int a[] = new int[size];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        //Ascending Selction sort
        System.out.println("Ascending");
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
            System.out.println(temp);
        }

        //Descending one
        System.out.println("Descending");
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]<a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
            System.out.println(temp);
        }

        sc.close();
    }
}
