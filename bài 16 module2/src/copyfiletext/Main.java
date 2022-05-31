package copyfiletext;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            CopyFileText resource = new CopyFileText();
            System.out.println("file truoc khi copy a.");
            String line = resource.readFileText("D:\\Module2\\bài 16 module2\\src\\file.txt");
            File target = new File("D:\\Module2\\bài 16 module2\\src\\file.txt");
            FileWriter fw = new FileWriter(target);
            fw.write(line);
            fw.close();
            System.out.println("Sau day la file text da duoc copy: ");
            resource.readFileText("D:\\Module2\\bài 16 module2\\src\\file.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
