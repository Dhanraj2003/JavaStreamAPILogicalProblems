package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {

        //sorting list
        List<Integer> list = Arrays.asList(10, 2, 4,07,07, 2, 5, 1, 45, 1, 4, 7, 8, 1, 3, 4, 2, 4, 1, 3, 5, 6);

        //ascending order:
        List<Integer> ascendingSort=list.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order list:"+ascendingSort);

        //descending order:
        List<Integer> collect = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse Order:"+collect);

    }
}
