import java.io.File;

public class fileList {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files){
            System.out.println(file);
        }


        /* 출력결과
        .\.git
        .\.idea
        .\a_file.txt
        .\File.iml
        .\out
        .\src
         */
    }
}
