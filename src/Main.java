import universityStructure.AverageScores;
import universityStructure.Creation;
import universityStructure.Student;

import java.security.acl.Group;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"English", "Philosophy", "Programming"};
        Creation.makingAll();
        Student lilit = Creation.createOneStudent("Lilit", new int[]{9, 6, 60}, subjects);
        Student nune = Creation.createOneStudent("Nune", new int[]{9, 6, 8}, subjects);

//        Group g1 = Creation.createOneGroup(705, new Student[]{lilit, nune});
        System.out.println(AverageScores.gpaOfStudent(lilit));
//        System.out.println(AverageScores.averageOfGroupFromOneSubj(g1, "English"));
//        Printing the average score of given subject in the group;
//        System.out.println("Average score of your given subject in given group is: " +
//                Math.round(AverageScores.averageOfGroupFromOneSubj(g1, "english")));

    }

}
