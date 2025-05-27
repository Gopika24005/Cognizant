import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("File content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
