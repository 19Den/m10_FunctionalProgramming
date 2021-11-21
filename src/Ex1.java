import java.util.ArrayList;

public class Ex1 {

    public String getStrings(ArrayList<String> strings) {
        String concatination = "";
        ArrayList<String> listOfNames = new ArrayList<String>();
        for (String str : strings) {
            listOfNames.add(str);
            if ((listOfNames.indexOf(str) % 2) != 0) {
                concatination = concatination.concat(listOfNames.indexOf(str) + ". " + listOfNames.get(listOfNames.indexOf(str)) + ", ");
            }
        }
        return concatination.substring(0, concatination.length() - 2);
    }
}
