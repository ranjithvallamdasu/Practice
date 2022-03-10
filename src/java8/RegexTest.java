package java8;

public class RegexTest {

    public static void main(String[] args) {
        String name = "123.3434";
        boolean matches = name.matches("^\\d+(\\.\\d+)?");
        System.out.println(matches);
        String s = "ranjith";
        boolean matches1 = s.matches("[^abc].*");
        System.out.println(matches1);
        s = "aaaabbcdddd";
        matches = s.matches("^a{3}b{2}c{1,4}d{2,4}");
        System.out.println(matches);
    }
}
