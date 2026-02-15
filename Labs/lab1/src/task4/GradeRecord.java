package task4;
import Practice2.Student;

public class GradeRecord {
    private Student student;
    private int grade;

    public GradeRecord(Student student, int grade){
        this.student = student;
        this.grade = grade;
    }

    public Student getStudent(){
        return student;
    }

    public int getGrade(){
        return grade;
    }
}
