import java.util.Optional;

public class optional1 {
    public static void main(String[] args) {
        String n = null;
        Optional<String> op = Optional.ofNullable(n);
        System.out.println(op);
    }
}
