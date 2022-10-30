package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OOMTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while(true){
            list.add("Ranjith");
        }
    }
}
