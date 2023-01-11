import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
    public static void main(String[] args) {

        List<String> specializationElements = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");
        List<String> specializations = specializationElements
                .stream()
                .map(s -> s.split(":"))
                .flatMap(Arrays::stream)
                .distinct().filter(s -> !s.equals("Szpital") && !s.equals("Przychodnia"))
                .collect(Collectors.toList());
        System.out.println(specializations);
    }
}
