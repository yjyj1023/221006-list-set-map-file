import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public String readtwo(String filename) throws IOException {

        String s1 = "";
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024  //버퍼사이즈
        );

        for(int i = 0; i<2; i++){
            s1+=(char)br.read();
        }

        return s1;
    }

    public static void main(String[] args) throws IOException {
        ReadFile2 readFile = new ReadFile2();

        String s2 = readFile.readtwo("./a_file.txt");

        System.out.println(s2);
    }
}
