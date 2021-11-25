import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {

    public String getStrings(ArrayList<String> strings) {

        List<String> oddList = IntStream
                .range(0, strings.size())
                .mapToObj(i -> i + ". " + strings.get(i))
                .filter(s -> s.charAt(0) % 2 != 0)
                .collect(Collectors.toList());

        return oddList
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
