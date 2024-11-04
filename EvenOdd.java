package java_stream_api_logical_problems_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOdd {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11, 2, 3, 45, 67, 9, 90, 87, 8, 2);

        //even numbers:
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbers = stream.filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers:"+evenNumbers);

        //odd numbers:
        Stream<Integer> newStream=list.stream();
        try {
            List<Integer> oddNumbers = newStream.filter(e-> e%2!=0).collect(Collectors.toList());
            System.out.println("Odd Numbers:"+oddNumbers);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
