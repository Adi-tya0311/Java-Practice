import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("263","77",null,"99");
        //list.stream().map((t)->t.length()).forEach(System.out::println);

        list.stream()
                .map(Optional::ofNullable)
                .forEach(value -> {
                    if (value.isPresent()) {
                        String x = value.get();
                        System.out.println("Length: " + x.length());
                    } else {
                        System.out.println("Null found");
                    }
                });
    }
}
