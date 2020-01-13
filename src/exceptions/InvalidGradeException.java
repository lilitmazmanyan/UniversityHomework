package exceptions;

public class InvalidGradeException extends Throwable {
    public InvalidGradeException() {
        System.out.println("Please make sure you entered scores and they are in correct range");

    }
}
