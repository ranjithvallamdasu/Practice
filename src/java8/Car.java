package java8;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle {

    public static final String NAME = "ranjith";

    @Override
    public void start() {
        System.out.println("engine started");
        List<String> list = new ArrayList<>();
        final String ranjith = NAME;

        if (true) {
            System.out.println(NAME);
        }
        getSomeItems("Iphone", 123);

        printName();

        String name = NAME;
        someMethod(name);

    }

    private void someMethod(String name) {
        if (name.equalsIgnoreCase(NAME)) {
            List<Integer> idList = new ArrayList<>();
            idList.add(123);
        }
    }

    private void printName() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ranjith");
            System.out.println("kumar");
            System.out.println("vallamdasu");
        }
    }

    @Override
    public String   getSomeItems(String itemName, Integer itemId) {

        return "someitems";
    }

    @Override
    public Integer getEngineId() {
        return 123;
    }

}

