package java8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(line,",");
        int totalWords = st.countTokens();
        System.out.println("total words: "+totalWords);
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}
