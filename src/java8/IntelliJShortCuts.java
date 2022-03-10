package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntelliJShortCuts {
    public static void main(String[] args) {

        //language=JSON
        String json = "{\n" +
                "  \"name\":\"ranjith\",\n" +
                "  \"age\": 26,\n" +
                "  \"organization\": \"highradius\",\n" +
                "  \"city\": \"hyderabad\"\n" +
                "}";
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        String name = "ranjith";
        if (!name.substring(1, 3).toLowerCase().substring(3).isBlank() ) {
            System.out.println(map.get("ranjith"));
        }
        Map<String, Object> someMap = new HashMap<>();
        Double ranjith = (Double) someMap.get("ranjith");
    }

    public ScannerTest getName(){
        String name = "ranjith";
        Integer age = 34;
        ScannerTest scannerTest = null ;
        List<Integer> list = new ArrayList<>();
        return scannerTest;
    }
}

class IntelliTest {
    private String suggestion ;
    private String name;

    @Override
    public String toString() {
        return "IntelliTest{" +
                "desc='" + suggestion + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
