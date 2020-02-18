import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Students {
    private final Map<Integer, String> studentGrades;

    Students(Map<Integer, String> studentGrades) {
        this.studentGrades = new HashMap<>(studentGrades);
    }

    public Map<Integer, String> getStudents() {
        return studentGrades;
    }


    public void getHighesGrade(){
        Integer highestGrade = 0;
        for (int grade: studentGrades.keySet()) {
            if(highestGrade < grade){
                highestGrade = grade;
            }
        }
        System.out.println(studentGrades.get(highestGrade) + " " + highestGrade);
    }
}



