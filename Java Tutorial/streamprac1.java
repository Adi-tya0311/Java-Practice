import java.util.*;
import java.util.stream.Collectors;
public class streamprac1{
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        // long l = list.stream().reduce(1, (a, b) -> a + b);
        // System.out.println(l);

        List<String> list = new ArrayList<>(Arrays.asList("Jimmy","Chuck","Donna","Harvey","Mike","Gus","Clara"));
        list.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> upperNames = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);

        //Collectior joining
        List<String> a = new ArrayList<>(Arrays.asList("Alex","Nolan","Dan","Bob"));
        String s = a.stream().collect(Collectors.joining("::"));
        System.out.println(s);

        //Grouping- by length
        Map<Integer,List<String>> grouped= a.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
