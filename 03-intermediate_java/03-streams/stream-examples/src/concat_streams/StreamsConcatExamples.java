package concat_streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcatExamples {
    public static void main(String[] args) {
        mergeTwoStringStreamsAndCountValues();
    }

    public static void mergeTwoStringStreamsAndCountValues() {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<String> stream2 = Stream.of("3", "4", "5", "6", "7", "8");

        Stream<String> stream3 = Stream.concat(stream1, stream2);
        Map<Object, Long> y = stream3.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(y);
    }
}
