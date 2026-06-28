public class Test {

    public static void main(String[] args) {

        Student model = new Student();
        model.setName("John");
        model.setId(101);
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("David");

        controller.updateView();
    }
}