package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생", 15, 90);
        System.out.println(student1);
        Student student2 = createStudent("학생", 16, 80);
        System.out.println(student2);

        printStudent(student1);
        printStudent(student2);

    }

    private static Student createStudent (String name, int age, int grade) {
        Student student = new Student();
        System.out.println(student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    private static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
