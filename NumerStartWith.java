package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerStartWith {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 222, 234, 567, 890, 432, 261, 211, 22);

        List<Integer> collect = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("9")).map(Integer::valueOf).collect(Collectors.toList());

    }
}