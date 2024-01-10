package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        initStudent(student1, "학생", 15, 90);
        initStudent(student2, "학생", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    private static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    private static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
