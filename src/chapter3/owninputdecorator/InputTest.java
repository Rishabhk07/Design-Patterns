package chapter3.owninputdecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        try {
            int c;
            File file = new File("test.txt");
            System.out.println(file.getCanonicalPath());
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream(file)));
            while ((c = inputStream.read()) > 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
