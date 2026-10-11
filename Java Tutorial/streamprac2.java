import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class streamprac2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Jimmy","Chuck","Donna","Harvey","Mike","Gus","Clara"));
        list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        numbers.stream().map(n -> n*n).toList();    //.forEach(System.out::println)
        System.out.println(numbers);

        //Counting pass and fail count
        List<Integer> marks = new ArrayList<>(Arrays.asList(45,33,64,78,51,80));
        long c = marks.stream().filter(n -> n>50).count();
        System.out.println(c);

        long f = marks.stream().filter(n -> n<50).count();
        System.out.println(f);
    }
}
