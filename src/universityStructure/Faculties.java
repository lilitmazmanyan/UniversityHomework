package universityStructure;

import exceptions.StudentsNumberException;

class Faculties {
    String name;
    void setGroups(GroupObject[] groups) throws StudentsNumberException {
        if (groups.length == 0)
            throw new StudentsNumberException();
    }

    Faculties(String name) {
        this.name = name;
    }

}
