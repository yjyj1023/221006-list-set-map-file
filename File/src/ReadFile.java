import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public char readOne(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        return (char)br.read();
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();

        char c1 = readFile.readOne("./a_file.txt");

        System.out.println(c1);
    }
}
