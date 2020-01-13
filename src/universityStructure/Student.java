package universityStructure;

import exceptions.InvalidGradeException;
import exceptions.InvalidSubjectException;

public class Student {
    public String name;
    private int[] scores;
    String[] subjects;

    public Student(String name) {
        this.name = name;
    }

    void setSubjects(String[] subjects) throws InvalidSubjectException {
        if (subjects == null) {
            throw new InvalidSubjectException();
        }
        this.subjects = subjects;
    }

    void setScores(int[] scores) throws InvalidGradeException {
        if (scores.length ==0) {
            throw new InvalidGradeException();
        }
        for (int score : scores) {
            if (score < 0 || score > 10) {
                throw new InvalidGradeException();
            }
        }
        this.scores = scores;
    }
    int[] getScores() {
        return this.scores;
    }

}