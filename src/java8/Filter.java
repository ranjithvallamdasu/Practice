package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
//        List<Integer> list = List.of(1,2,3,4,5);
//        list = list.stream().filter(x->x*2).collect(Collectors.toList());
//        System.out.println(list);

        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> evenList = list.stream().
                map(x -> x*2).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
