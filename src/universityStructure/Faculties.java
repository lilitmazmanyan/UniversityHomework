package universityStructure;

class Faculties {
    String name;
    GroupObject[] groups;

    public GroupObject[] getGroups() {
        return groups;
    }

    public void setGroups(GroupObject[] groups) {
        this.groups = groups;
    }

    Faculties(String name) {
        this.name = name;
    }

}
