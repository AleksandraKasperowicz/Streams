import java.util.ArrayList;
import java.util.List;

public class mainLetterInWord {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        word.add("String");
        word.add("Stream");
        word.add("Pije Kawe");
        System.out.println(LettersInWord.convertStringToCharList(word.toString()));
    }

}
