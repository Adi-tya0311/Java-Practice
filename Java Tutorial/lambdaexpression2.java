import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaexpression2 {
    public static void main(String[] args){
        //Lambda expressions
        List<String> listname = new ArrayList<>(Arrays.asList("Ace","Chris","Lily","America","Judy","Max","Alex","Trevor","Alice","Agent","Noah"));
        listname.forEach(name -> System.out.println(name));
        System.out.println("\nNames starting with A: ");
        listname.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}
