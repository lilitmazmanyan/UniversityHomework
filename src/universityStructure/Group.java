package universityStructure;

import exceptions.StudentsNumberException;

class Group {
    Student[] students;
    int numberOfGroup;

    void setStudents(Student[] students) throws StudentsNumberException {
        this.students = students;
        if (students.length == 0)
            throw new StudentsNumberException();

    }

    Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }
}
