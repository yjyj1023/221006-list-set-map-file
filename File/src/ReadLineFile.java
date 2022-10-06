import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFile {
    private String filename;

    public ReadLineFile(String filename) {
        this.filename = filename;
    }

    public String readLineOne() throws IOException {


        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024  //버퍼사이즈
        );
        String s1 = br.readLine();

        return s1;
    }

    public static void main(String[] args) throws IOException {
        ReadLineFile readLineFile = new ReadLineFile("./a_file.txt");

        String s2 = readLineFile.readLineOne();
        System.out.println(s2);

    }
}
