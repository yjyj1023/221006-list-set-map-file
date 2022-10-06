import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFile2 {
    private String filename;

    public ReadLineFile2(String filename) {
        this.filename = filename;
    }

    public String readLineN(int num) throws IOException {


        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024  //버퍼사이즈
        );
        String s1 = "";
        for(int i =0; i<num; i++){
            String s2 = br.readLine();
            if(s2!=null){
                s1+=s2+'\n';
            }else{
                System.out.println("라인 초과");
                break;
            }
        }

        return s1;
    }

    public static void main(String[] args) throws IOException {
        ReadLineFile2 readLineFile2 = new ReadLineFile2("./a_file.txt");

        int num = 3;
        String s2 = readLineFile2.readLineN(num);
        System.out.println(s2);

    }
}
