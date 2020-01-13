package universityStructure;

import exceptions.StudentsNumberException;

public class GroupObject {
    Student[] students;
    int numberOfGroup;

    void setStudents(Student[] students) throws StudentsNumberException {
        this.students = students;
        if (students.length == 0)
            throw new StudentsNumberException();

    }

    public GroupObject(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

}
