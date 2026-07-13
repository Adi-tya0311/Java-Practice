import java.util.Arrays;

public class lenarray{
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6};
        int[] revarray = new int[array1.length];

        int j=0;

        for(int i=array1.length-1;i>=0;i--){
            revarray[j] = array1[i];
            j++;
        }
        System.out.println("Reversed array is "+Arrays.toString(revarray));
    }
}