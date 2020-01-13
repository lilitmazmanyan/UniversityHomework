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

    // The output of the following method is the average mark of group from one subject
    public static double averageOfGroupFromOneSubj(GroupObject group, String subject) {
        double mark = 0;
        try {
            for (int i = 0, j = 0; i < group.students.length && j < group.students[i].getScores().length; j++, i++) {
                int k = defineIndex(group.students[i], subject);
                mark += group.students[i].getScores()[k];
            }
        } catch (NullPointerException ex) {
            System.out.println("Error occurres because scores of one of your students are invalid");
        }
        return mark / group.students.length;
    }

    //Method gives the average score of faculty from given subject
    public static double averageOfFacultyFromSubject(Faculties faculties, String subject) {
        double mark = 0;
        for (int i = 0; i < faculties.getGroups().length; i++) {
            mark += averageOfGroupFromOneSubj(faculties.getGroups()[i], subject);
        }
        return mark / (faculties.getGroups().length);
    }

    //Following method defines index of given subject in Student's subjects array
    private static int defineIndex(Student student, String subject) throws ArrayIndexOutOfBoundsException {
        int i = 0;
        while (student.subjects[i] != subject) {
            i++;
        }
        return i;

    }

}
