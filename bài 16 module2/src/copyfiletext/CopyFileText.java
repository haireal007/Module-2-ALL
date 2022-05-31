package copyfiletext;

import java.io.*;

public class CopyFileText {

    public String readFileText(String filePath) throws Exception {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        String s = "";

        while ((line = br.readLine()) != null) {
            s += (line + " ");
        }
        System.out.println(s);
        br.close();
        return s;
    }
}
