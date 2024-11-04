package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 30, 10, 70);


        Stream<Integer> stream = list.stream();
        Integer sum = stream.reduce(0, (a, b) -> a + b);
        System.out.println("Sum:"+sum);
    }
}
