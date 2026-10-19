import java.util.ArrayList;
import java.util.Arrays;

public class arraylist1 {
    public static void main(String[] args) {
        //List 1 = 20,30,40,10
        //List 2 = 20,90,30,67
        //Common List = 20,30
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(20,30,40,10));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(20,90,30,67));
        ArrayList<Integer> common = new ArrayList<>();
        ArrayList<Integer> uncommon = new ArrayList<>();

        for(Integer x: a){
            if(b.contains(x)){
                common.add(x);
            }
            else{
                uncommon.add(x);
            }
        }System.out.println(common);
        // System.out.println(uncommon);

        for(Integer y: b){
            if(!a.contains(y)){
                uncommon.add(y);
            }
        }System.out.println(uncommon);

        if(a.equals(b)){
            System.out.println("Equal");
        }

        int x[][] = new int[3][];
        x[0] = new int[5];
        System.out.println(x[0].length);

    }   
}
