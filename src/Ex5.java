import java.util.stream.Stream;

public class Ex5 {

    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        var iteratorFirst = first.iterator();
        var iteratorSecond = second.iterator();

        return Stream.generate(() -> null)
                .takeWhile(o -> iteratorFirst.hasNext())
                .takeWhile(o -> iteratorSecond.hasNext())
                .flatMap(o -> Stream.of(iteratorFirst.next(), iteratorSecond.next()));

    }
}
