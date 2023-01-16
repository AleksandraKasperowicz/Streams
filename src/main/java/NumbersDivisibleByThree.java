import java.util.Arrays;
import java.util.stream.IntStream;

public class NumbersDivisibleByThree {
    public static void main(String[] args) {

        Arrays.stream(number(IntStream.range(0, 99))).forEach(System.out::println);

    }

    public static Integer[] number(IntStream intStream) {
        return
                intStream
                        .filter(i -> i % 3 == 0 && i != 0)
                        .boxed()
                        .toArray(Integer[]::new);
    }
}
