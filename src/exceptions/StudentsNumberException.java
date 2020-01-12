package exceptions;

public class StudentsNumberException extends Throwable {
    public StudentsNumberException(){
        System.out.println("An error occurred while making group. Every group should have at least one group");
    }
}
