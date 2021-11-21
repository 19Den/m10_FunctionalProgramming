import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex4 {
    public Stream<Long> streamOfRandomNumbers(long a, long c, long m, long seed) {

        LongStream stream = LongStream.iterate(seed, n -> (a * n + c) % m)
                .limit(10);

        return stream.boxed();
    }
}
