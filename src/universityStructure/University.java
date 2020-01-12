package universityStructure;

class University {
    String name;
    Faculties[] faculties;

    void setFaculties(Faculties[] faculties) throws Exception {
        if (faculties == null || faculties.length == 0) {
            throw new Exception("At least one Faculty");
        }
        this.faculties = faculties;
    }

    University(String name) {
        this.name = name;
    }
}
