public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("John Doe", 123, "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial view
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.updateView();
    }
}
