import java.util.Arrays;

public class a{
    public static void main(String[] args){
        int[] arr1 = {3,4,5,6,7};
        int[] arr2 = new int[arr1.length];

        int j = 0;

        for(int i=arr1.length-1;i>=0;i--){
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}