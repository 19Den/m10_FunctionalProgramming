import java.util.ArrayList;
import java.util.Comparator;

public class Ex3 {
    public String extractDigits(String arr) {
        StringBuilder result = new StringBuilder();
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < arr.length(); i++) {
            String symbol = String.valueOf(arr.charAt(i));
            if (symbol.matches("-?\\d+(\\.\\d+)?")) {
                numbers.add(symbol);
            }
        }
        numbers.sort(Comparator.naturalOrder());
        for (Object str : numbers) {
            result.append(str).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}
