import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {
    private String filename;

    public ReadFile3(String filename) {
        this.filename = filename;
    }

    public String readN(int num) throws IOException {

        String s1 = "";
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024  //버퍼사이즈
        );

        for(int i = 0; i<num; i++){
            int c = br.read();
            if(c!=-1){
                s1+=(char)c;
            }
            else{
                System.out.println("글자 수를 초과했습니다.");
                break;
            }
        }
        return s1;
    }

    public static void main(String[] args) throws IOException {
        ReadFile3 readFile = new ReadFile3("./a_file.txt");

        int num = 100;

        String s2 = readFile.readN(num);

        System.out.println(num+"개 글자 출력:"+s2);
    }
}