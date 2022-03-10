package java8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class UTF16Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("UTF-16.txt", Charset.forName("UTF-16")));
        try (bufferedWriter){
            bufferedWriter.write("hello ranjith kumar vallamdasu ");
            bufferedWriter.write("how are you? some blah blah test added to increase the size of the file");
            bufferedWriter.write("this is utf 16 text and im going to test the size after writing this text to file");
            bufferedWriter.write("significant change in size is observed between utf-8 and utf-16");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
