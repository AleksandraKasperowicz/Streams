import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersDivisibleByThree {
    List<Integer> numberList = new ArrayList<>(Arrays.asList(3, 6, 76, 88, 96, 199, 6, 9, 5, 7, 49, 15));

    public List<Integer> getDivideNumbers() {
        return numberList.stream()
                .filter(num -> num % 3 == 0)
                .collect(Collectors.toList());
    }

}
