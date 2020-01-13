package universityStructure;

import universityStructure.Student;

public class AverageScores {
    //This method counts the average score if the student
    public static double gpaOfStudent(Student student) {
        try {
            double avgMark = 0.0D;
            for (int i = 0; i < student.getScores().length; ++i) {
                avgMark += student.getScores()[i];
            }
            return avgMark / (double) student.getScores().length;
        } catch (NullPointerException ex) {
            System.out.println("Something was wrong with your scores");
        }
        return 0;
    }


    //Methodi mej inch en chi vor nuyn usanoghin ereq angam hashvum a
    // xumb meki hamar 8+8+8+7+7+7+6+6+6
    public static double averageOfGroupFromOneSubj(Group group, String subject) {
        double mark = 0;
        for (int i = 0, j = 0; i < group.students.length && j < group.students[i].getScores().length; j++, i++) {
            // piti gtnenq usanoghi subjects stringi mej ed subjecti indexy u getScores[index]ov gumarenq
            int k = defineIndex(group.students[i], subject);
            mark += group.students[i].getScores()[k];
        }
        return mark / group.students.length;
    }

    private static int defineIndex(Student student, String subject) {
        int i = 0;
        while (student.subjects[i] != subject) {
            ++i;
        }
        return i;
    }
}
