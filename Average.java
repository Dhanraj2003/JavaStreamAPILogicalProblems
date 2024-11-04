package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        double asDouble = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average:"+asDouble);

//        OptionalDouble average = list.stream().mapToInt(e -> e).average();
//        average.ifPresent(e-> System.out.println(e));
    }
}
