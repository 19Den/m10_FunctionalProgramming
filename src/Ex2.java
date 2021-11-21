import java.util.ArrayList;
import java.util.Comparator;

public class Ex2 {
    public ArrayList<String> uppercaseSorted(ArrayList<String> strings) {
        ArrayList<String> listOfNames = new ArrayList<String>();
        for (String str : strings) {
            listOfNames.add(str);
        }
        listOfNames.replaceAll(String::toUpperCase);
        listOfNames.sort(Comparator.naturalOrder());
        listOfNames.sort(Comparator.reverseOrder());
        return listOfNames;
    }
}
