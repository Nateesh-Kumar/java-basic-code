import java.util.ArrayList;
import java.util.List;

public class Student {
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        } else {
            grades.add(grade);
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

