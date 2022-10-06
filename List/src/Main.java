import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        //students를 만든이유: listExercise.getStudents()가 2번 반복되기 때문에
        List<String> students = listExercise.getStudents();
        for (String student: students ) {
            System.out.println(student);
        }

        System.out.println(students.size());
    }
}