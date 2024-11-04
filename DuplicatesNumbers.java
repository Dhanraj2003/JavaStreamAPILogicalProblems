package java_stream_api_logical_problems_youTube;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 2, 4,07,07, 2, 5, 1, 45, 1, 4, 7, 8, 1, 3, 4, 2, 4, 1, 3, 5, 6);

        //1st way duplicates find:
        Set<Integer> collect = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println("Duplicates elements are:"+collect);

        //2nd way duplicates find:

        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> dup = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
        System.out.println(dup);

        //set.add(e):return true if e was not already present in set and add it to set
        //!se.add(e):return true(meaning its duplicates) if e was already in set




    }
}
