import java.util.Arrays;

public class Ex3 {

    public String extractDigits(String arr) {

        int[] number = arr.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sorted()
                .toArray();

        return Arrays.toString(number);
    }
}
