import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StorePath {


    public static boolean readFile() {
        try {

            for (int i = 1; i <= 100; i++) {

               String path = "C:\\Doc\\Doc (" + i + ").txt";
                //StringTokenizer s = new StringTokenizer(readBuffer(path), InvetedIndex.delim);
                InvetedIndex.addTextToLinkedLists(new StringTokenizer(readBuffer(path), InvetedIndex.delim), i);

            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static String readBuffer(String path) throws Exception {
        String text = "";
        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text = line + " " + text;

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toLowerCase();

    }
}
