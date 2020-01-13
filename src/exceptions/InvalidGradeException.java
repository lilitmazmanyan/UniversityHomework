package exceptions;

public class InvalidGradeException extends Exception {
    public InvalidGradeException() {
        System.out.println("Please make sure you entered scores and they are in correct range");
    }
}
