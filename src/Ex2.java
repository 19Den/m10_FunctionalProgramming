import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

    public ArrayList<String> uppercaseSorting(ArrayList<String> strings) {

        List<String> result = strings.stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return (ArrayList<String>) result;
    }
}
