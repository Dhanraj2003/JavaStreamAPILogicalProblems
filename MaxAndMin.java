package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 2, 4,07,07, 2, 5, 1, 45, 1, 4, 7, 8, 1, 3, 4, 2, 4, 1, 3, 5, 6);

        Integer i = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max:"+i);

        Integer i1 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min:"+i1);


    }
}
