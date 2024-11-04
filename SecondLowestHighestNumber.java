package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 2, 4,07,07, 2, 5, 1, 45, 1, 4, 7, 8, 1, 3, 4, 2, 4, 1, 3, 5, 6,90,89);

        Integer i = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second largest element:"+i);

        Integer i1 = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second smallest element is:"+i1);


    }
}
