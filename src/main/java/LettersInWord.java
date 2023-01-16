import java.util.*;
import static java.util.stream.Collectors.*;


public class LettersInWord {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        word.add("String");
        word.add("Stream");
        word.add("Pije Kawe");
        System.out.println(convertStringToCharList(word.toString()));
    }

    public static List<Character> convertStringToCharList(String word) {
        return word
                .toUpperCase()
                .chars()
                .mapToObj(e -> (char) e)
                .filter(e->((e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z')))
                .sorted()
                .distinct()
                .collect(toList());

    }
}
