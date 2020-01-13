package universityStructure;

import exceptions.InvalidGradeException;
import exceptions.InvalidSubjectException;
import exceptions.StudentsNumberException;

public class Creation {
    public void makingAll() {
        String[] subjectsOfIAM = new String[]{"discrete", "english", "programming"};
        String[] secondFacSubjects = new String[]{"history", "philosophy", "english"};
        String[] thirdFacSubjects = new String[]{"english", "philosophy", "programming"};

        //Making students with constructor, names are mandatory for every student before creating them.
        // Other Student fields have their setter/getters
        Student s1 = createOneStudent("Mar", new int[]{6, 2, 9}, subjectsOfIAM);
        Student s2 = createOneStudent("Sus", new int[]{4, 9, 6}, subjectsOfIAM);
        Student s3 = createOneStudent("Mark", new int[]{6, 8, 9}, subjectsOfIAM);
        Student s4 = createOneStudent("Lus", new int[]{6, 7, 3}, secondFacSubjects);
        Student s5 = createOneStudent("Nell", new int[]{8, 5, 9}, secondFacSubjects);
        Student s6 = createOneStudent("Arto", new int[]{8, 9, 9}, secondFacSubjects);
        Student s7 = createOneStudent("Lil", new int[]{9, 7, 9}, thirdFacSubjects);
        Student s8 = createOneStudent("Koj", new int[]{8, 8, 9}, thirdFacSubjects);
        Student s9 = createOneStudent("Liza", new int[]{8, 2, 9}, thirdFacSubjects);

        Student[] studentsList = new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9};

        GroupObject g1 = createOneGroup(701, new Student[]{s1, s2, s3});
        GroupObject g2 = createOneGroup(704, new Student[]{s4, s5, s6});
        GroupObject g3 = createOneGroup(707, new Student[]{s7, s8, s9});

        GroupObject[] hosq1 = new GroupObject[]{g1, g2};
        GroupObject[] hosq2 = new GroupObject[]{g3};

        Faculties f1 = new Faculties("iam");
        Faculties f2 = new Faculties("intRel");

        f1.setGroups(hosq1);
        f2.setGroups(hosq2);

        //Making 2 faculties for one university
        Faculties[] faculties = new Faculties[]{f1, f2};

        //And here it goes university
        University university = new University("YSU");
        try {
            university.setFaculties(faculties);
        } catch (Exception ex) {
            System.out.println("There was an error while making University. University should have at least one faculty");
        }

        printMethods(studentsList, g1, f1);

    }

    public static void printMethods(Student[] studentsList, GroupObject givenGroup, Faculties givenFaculty) {
        //Printing average mark of every student
        for (Student student : studentsList) {
            System.out.println("Average mark of " + student.name + " is: " + AverageScores.gpaOfStudent(student));
        }

        System.out.println("--------------------------------Break--Here------------------------------------------");

        //Printint subjects of each group
        System.out.println("Subjects of every group");
        int k = 1;
        for (int i = 1; i <= studentsList.length; i += 3) {
            System.out.println("\nSubjects of group " + k + " are:");
            for (int j = 0; j < studentsList[i].subjects.length; j++) {
                System.out.println(studentsList[i].subjects[j]);
                k++;
            }
        }
        //Printing average mark from given subject in the gropu
        System.out.println("Average Score of group from subject is: " +
                AverageScores.averageOfGroupFromOneSubj(givenGroup, "programming"));

        //Printing Average Score from faculty of given subject
        System.out.println("Printing average of subject of faculty " +
                AverageScores.averageOfFacultyFromSubject(givenFaculty, "english"));


    }

    //Making student groups to pass them to make groups
    public GroupObject createOneGroup(int number, Student[] studentsList) {
        Student[] gr1 = studentsList;
        GroupObject group = new GroupObject(number);
        try {
            group.setStudents(gr1);
        } catch (StudentsNumberException ex) {
        }
        return group;
    }

    public Student createOneStudent(String name, int[] scores, String[] subjects) {
        Student s1 = new Student(name);
        try {
            s1.setScores(scores);
        } catch (InvalidGradeException e) {
        }
        try {
            s1.setSubjects(subjects);
        } catch (InvalidSubjectException e) {
        }
        return s1;
    }

}
