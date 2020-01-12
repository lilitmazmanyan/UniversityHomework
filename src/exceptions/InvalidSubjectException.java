package exceptions;

public class InvalidSubjectException extends Throwable {
    public InvalidSubjectException() {
        System.out.println("Grade is invalid");
    }
}
