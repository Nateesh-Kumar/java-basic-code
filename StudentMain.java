public class StudentMain {
    
        public static void main(String[] args) {
            Student student = new Student(1, "John Doe");
            student.addGrade(85);
            student.addGrade(90);
            student.addGrade(105);  // This will print an error message
    
            System.out.println(student.getStudent_id());
            System.out.println(student.getStudent_name());
            System.out.println(student.getGrades());
        }
    }
    
    

