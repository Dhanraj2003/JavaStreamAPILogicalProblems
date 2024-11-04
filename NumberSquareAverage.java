package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberSquareAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);

        Stream<Integer> stream = list.stream();

        List<Integer> collect = stream.map(e -> e * e).collect(Collectors.toList());
        System.out.println("Square of each element:"+collect);
        List<Integer> graterThan100 = collect.stream().filter(e -> e > 100).collect(Collectors.toList());
        System.out.println("Greater than 100:"+graterThan100);
        OptionalDouble average = graterThan100.stream().mapToInt(e -> e).average();
        average.ifPresent(e->System.out.println("Average:"+e));

    }
}
