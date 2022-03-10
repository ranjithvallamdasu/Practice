package java8;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,5);
        final IntStream another = intStream.onClose(()->{
            System.out.println("rtr");
            OptionalInt min = intStream.min();
            System.out.println(min.orElseThrow());
        });
        try(intStream){
            OptionalInt max = intStream.max();
            System.out.println(max.orElseThrow());
        } catch (Exception e){
            System.err.println("error: "+e);
        }



//        boolean allMatch = intStream.allMatch(x -> x > 2);
//        System.out.println(allMatch);
//        intStream.cl
//        IntStream another = null;
//        intStream.onClose(()->{
//            System.out.println("rtr");
////            OptionalInt max = intStream.max();
////            System.out.println(max.orElseThrow());
//        });
//        intStream.close();



    }
}
