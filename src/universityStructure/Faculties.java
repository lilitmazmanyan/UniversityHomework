package universityStructure;

import exceptions.StudentsNumberException;

class Faculties {
    void setGroups(Group[] groups) throws StudentsNumberException {
        if (groups.length == 0)
            throw new StudentsNumberException();
    }

    Faculties(String name) {
    }
}
