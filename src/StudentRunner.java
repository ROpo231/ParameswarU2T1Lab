public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student(34.5, 8);
        student1.introduces();
        student1.weights();
        Student student2 = new Student(300000.5, 4567);
        student2.introduces();
        student2.weights();

    }
}
