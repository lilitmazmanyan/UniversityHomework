package universityStructure;

import universityStructure.Student;

public class AverageScores {
    //This method counts the average score if the student
    public static double gpaOfStudent(Student student) {
        double avgMark = 0.0D;
        try {
            for (int i = 0; i < student.getScores().length; ++i) {
                avgMark += student.getScores()[i];
            }
            return avgMark / (double) student.getScores().length;
        } catch (NullPointerException ex) {
            System.out.println("Something was wrong with your scores");
        }
        return avgMark;
    }

    //Methodi mej inch en chi vor nuyn usanoghin ereq angam hashvum a
    // xumb meki hamar 8+8+8+7+7+7+6+6+6
    public static double averageOfGroupFromOneSubj(GroupObject group, String subject) {
        double mark = 0;
        try {
            for (int i = 0, j = 0; i < group.students.length && j < group.students[i].getScores().length; j++, i++) {
                // piti gtnenq usanoghi subjects stringi mej ed subjecti indexy u getScores[index]ov gumarenq
                int k = defineIndex(group.students[i], subject);
                mark += group.students[i].getScores()[k];
            }
        } catch (NullPointerException ex) {
            System.out.println("Error occurres because scores of one of your students are invalid");
        }
        return mark / group.students.length;
    }

    public static double averageOfFacultyFromSubject(Faculties faculties, String subject) {
        double mark = 0;
        for (int i = 0; i < faculties.getGroups().length; i++) {
            mark += averageOfGroupFromOneSubj(faculties.getGroups()[i], subject);
        }
        return mark / (faculties.getGroups().length);
    }

    private static int defineIndex(Student student, String subject) throws ArrayIndexOutOfBoundsException {
        int i = 0;
        while (student.subjects[i] != subject) {
            i++;
        }
        return i;

    }

}
