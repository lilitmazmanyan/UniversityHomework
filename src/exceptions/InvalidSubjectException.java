package exceptions;

public class InvalidSubjectException extends Exception {
    public InvalidSubjectException() {
        System.out.println("Grade is invalid");
    }
}
