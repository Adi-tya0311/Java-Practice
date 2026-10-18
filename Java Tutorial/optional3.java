import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("32","44","12","19",null,"90","68","54"));
        Optional<Integer> max = list.stream()
                                    .filter((t)->t!=null)
                                    .map(Integer::parseInt)
                                    .reduce(Integer::max);

        if(max.isPresent()){
            System.out.println(max.get());
        }else{
            System.out.println("NUll was found.");
        }
    }
}
