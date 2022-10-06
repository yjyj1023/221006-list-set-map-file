import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;

    //생성자에서 student를 바로 사용할 수 없어서(student가 private으로 선언)
    //get 메소드를 하나 만들어줘야함.
    public ListExercise(){

        this.students = new ArrayList<>();
        students.add("이연재");
        students.add("이연재2");
        students.add("이연재3");
    }

    public List<String> getStudents(){
        return this.students;
    }
}
