package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 2, 4,07,07, 2, 5, 1, 45, 1, 4, 7, 8, 1, 3, 4, 2, 4, 1, 3, 5, 6);

        System.out.println("entire list:"+list);
        //limit:
        //take first five numbers and sum
        List<Integer> collect = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("first five numbers:"+collect);

        Integer i = collect.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum of first five numbers is:"+i);

        //skip first five numbers:
        List<Integer> collect1 = list.stream().skip(5).collect(Collectors.toList());
        System.out.println("After skiping first five numbers:"+collect1);

        Integer i1 = collect1.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum of remaining elements is:"+i1);
    }
}
