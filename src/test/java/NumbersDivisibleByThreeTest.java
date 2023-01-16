import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumbersDivisibleByThreeTest {

    @Test
    void getDivideNumbers() {
        NumbersDivisibleByThree numbers = new NumbersDivisibleByThree();
        List<Integer> result = numbers.getDivideNumbers();
        System.out.println(result);
        Assertions.assertEquals("[3, 6, 96, 6, 9, 15]", result.toString());
    }
}