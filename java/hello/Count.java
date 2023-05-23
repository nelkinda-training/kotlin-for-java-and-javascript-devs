import static java.util.stream.IntStream.rangeClosed;
import static java.lang.System.out;

public class Count {
    public static void main(final String... args) {
        rangeClosed(1, 10).forEach(it ->
            out.println(it)
        );
    }
}
