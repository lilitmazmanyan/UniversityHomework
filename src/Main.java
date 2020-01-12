import universityStructure.Creation;
import universityStructure.Student;

public class Main {
    public static void main(String[] args) {
        Creation.makingAll();
        Student lilit = Creation.createOneStudent();
        System.out.println(Creation.gpaOfStudent(lilit));
    }
}
