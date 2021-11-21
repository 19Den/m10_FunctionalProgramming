import java.util.ArrayList;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Roman");
        list.add("Yuri");
        list.add("Gregory");
        list.add("Vladimir");
        list.add("Nikolay");

        //Ex1 ex1 = new Ex1();
        //System.out.println(ex1.getStrings(list));

        //Ex2 ex2 = new Ex2();
        //System.out.println(ex2.uppercaseSorted(list));

        //Ex3 ex3 = new Ex3();
        //System.out.println(ex3.extractDigits("[\"1, 2, 0\", \"4, 5\"]"));

        //Ex4 ex4 = new Ex4();
        //ex4.streamOfRandomNumbers(252149, 11, (int) Math.pow(2, 48), 0).forEach(System.out::println);

        /*Ex5 ex5 = new Ex5();
        Stream<Object> list1 = Stream.of(0, 2, 4, 6, 8, 10, 12);
        Stream<Object> list2 = Stream.of(1, 3, 5, 7);
        ex5.zip(list1, list2).forEach(System.out::println);*/
    }
}
