package universityStructure;

import exceptions.InvalidGradeException;
import exceptions.InvalidSubjectException;
import exceptions.StudentsNumberException;

public class Creation {
    public static void makingAll() {
        //Creating some subjects that different groups are going to pass
        Subject discrete = new Subject("Discrete");
        Subject english = new Subject("English");
        Subject programming = new Subject("Programming");
        Subject history = new Subject("History");
        Subject philosophy = new Subject("Philosophy");

        Subject[] subjectsOfIAM = new Subject[]{discrete, english, programming};
        Subject[] secondFacSubjects = new Subject[]{history, philosophy, english};
        Subject[] thirdFacSubjects = new Subject[]{english, philosophy, programming};

        //Making students with constructor, names are mandatory for every student before creating them.
        // Other Student fields have their setter/getters
        Student s1 = new Student("Mar");
        Student s2 = new Student("Sus");
        Student s3 = new Student("Mark");
        Student s4 = new Student("Lus");
        Student s5 = new Student("Nell");
        Student s6 = new Student("Arto");
        Student s7 = new Student("Lil");
        Student s8 = new Student("Koj");
        Student s9 = new Student("Liza");

        //Trying to set their subjects and scores
        try {
            s1.setSubjects(subjectsOfIAM);
            s2.setSubjects(subjectsOfIAM);
            s3.setSubjects(subjectsOfIAM);
            s4.setSubjects(secondFacSubjects);
            s5.setSubjects(secondFacSubjects);
            s6.setSubjects(secondFacSubjects);
            s7.setSubjects(thirdFacSubjects);
            s8.setSubjects(thirdFacSubjects);
            s9.setSubjects(thirdFacSubjects);
        } catch (InvalidSubjectException es) {
//            System.out.println("An error occurred while setting subjects of one of the students ");
        }


        try {
            s1.setScores(new int[]{8, 6, 7});
            s2.setScores(new int[]{7, 6, 7});
            s3.setScores(new int[]{6, 5, 8});
            s4.setScores(new int[]{8, 7, 3});
            s5.setScores(new int[]{7, 6, 9});
            s6.setScores(new int[]{8, 8, 9});
            s7.setScores(new int[]{7, 9, 9});
            s8.setScores(new int[]{9, 8, 7});
            s9.setScores(new int[]{7, 1, 7});
        } catch (InvalidGradeException ex) {
//            System.out.println("An error occurred while setting scores of one of the students ");
        } catch (Exception ex) {
            System.out.println("Made an exception that you didn't think of");
        }

        //Making student groups to pass them to make groups
        Student[] gr1 = new Student[]{s1, s2, s3};
        Group g1 = new Group(701);

        Student[] gr2 = new Student[]{s4, s5, s6};
        Group g2 = new Group(704);

        Student[] gr3 = new Student[]{s7, s8, s9};
        Group g3 = new Group(707);


        try {
            g1.setStudents(gr1);
            g2.setStudents(gr2);
            g3.setStudents(gr3);
        } catch (StudentsNumberException ex) {
//            System.out.println("There is an error while making groupes. " +
//                    "There should be at least one student in every group");
        }

        Student[] studentsList = new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9};

        Group[] hosq1 = new Group[]{g1, g2};
        Group[] hosq2 = new Group[]{g3};

        Faculties f1 = new Faculties("iam");
        Faculties f2 = new Faculties("intRel");

        try {
            f1.setGroups(hosq1);
            f2.setGroups(hosq2);
        } catch (StudentsNumberException ex) {
//            System.out.println("An error occurred while making faculties. Any faculty should have at least one group");
        }

        //Making 2 faculties for one university
        Faculties[] faculties = new Faculties[]{f1, f2};

        //And here it goes university
        University university = new University("YSU");

        try {
            university.setFaculties(faculties);
        } catch (Exception ex) {
            System.out.println("There was an error while making University. University should have at least one faculty");
        }

        //Printing average mark of every student
        for (Student student : studentsList) {
            System.out.println("Average mark of " + student.name + " is: " + gpaOfStudent(student));
        }

        System.out.println("--------------------------------Break--Here------------------------------------------");

        //Printint subjects of each group
        System.out.println("Subjects of every group");
        int k = 1;
        for (int i = 1; i <= studentsList.length; i += 3) {
            System.out.println("\nSubjects of group " + k + " are:");
            for (int j = 0; j < studentsList[i].subjects.length; j++) {
                System.out.println(studentsList[i].subjects[j].name);
            }
            k++;
        }

    }

    public static Student createOneStudent() {
        Student lilit = new Student("Lilit");
        Subject english = new Subject("Englisj"), psychology = new Subject("Psychology"),
                programming = new Subject("Programming");
        try {
            lilit.setScores(new int[]{9, 9, 9});
        } catch (InvalidGradeException e) {
        }
        try {
            lilit.setSubjects(new Subject[]{english, psychology, programming});
        } catch (InvalidSubjectException e) {
        }
        return lilit;
    }

    //This method counts the average score if the student
    public static double gpaOfStudent(Student student) {
        double avgMark = 0.0D;
        for (int i = 0; i < student.getScores().length; ++i) {
            avgMark += student.getScores()[i];
        }
        return avgMark / (double) student.getScores().length;
    }

}
