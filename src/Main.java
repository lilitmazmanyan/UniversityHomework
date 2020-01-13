import universityStructure.AverageScores;
import universityStructure.Creation;
import universityStructure.GroupObject;
import universityStructure.Student;

import java.security.acl.Group;

public class Main {
    public static void main(String[] args) {
//        String[] subjects = {"English", "Philosophy", "Programming"};
////        Creation.makingAll();
//        Student lilit = Creation.createOneStudent("Lilit", new int[]{9, 6, 9}, subjects);
//        Student nune = Creation.createOneStudent("Nune", new int[]{9, 6, 8}, subjects);
//        GroupObject g1 = Creation.createOneGroup(705, new Student[]{lilit, nune});
//
//        System.out.println("Average mark of " + lilit.name +" is: "+ AverageScores.gpaOfStudent(lilit));
//        System.out.println("Average score of group from given subject " +
//                AverageScores.averageOfGroupFromOneSubj(g1, "English"));
////        Printing the average score of given subject in the group;
//        System.out.println("Average score of your given subject in given group is: " +
//                Math.round(AverageScores.averageOfGroupFromOneSubj(g1, "english")));
        Creation c = new Creation();
        c.makingAll();
    }

}
