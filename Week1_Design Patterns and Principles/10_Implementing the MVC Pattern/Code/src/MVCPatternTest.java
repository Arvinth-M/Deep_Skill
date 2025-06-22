import controller.StudentController;
import model.Student;
import view.StudentView;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("101", "Alice Smith", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        System.out.println("--- Initial Student Details ---");
        controller.updateView();

        System.out.println("\n--- Updating Student Details ---");
        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("B+");

        System.out.println("\n--- Updated Student Details ---");
        controller.updateView();

        System.out.println("\n--- Changing only ID ---");
        controller.setStudentId("1002");
        controller.updateView();
    }
}