package OOPs.GradeProject;

public class StudentRunner {
    public static void main(String[] args) {
        Grade dhakshesh_grade = new Grade("Java", 100.0, true);
        Student dhakshesh = new Student("Dhakshesh", 10, dhakshesh_grade);
        System.out.println("Name: " + dhakshesh.getName());
        System.out.println("Grade Level: " + dhakshesh.getGradeLevel());
        System.out.println("Grade on " + dhakshesh.getGrade().getSubject() + ": " + dhakshesh.toString());
    }
}