public class School {
    private String nameSchool;

    private Student[] students;

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public  int quantityOfStudents(){
        int count = 0;
        for(Student student:students){
            if(student.getAge() < 10){
                count++;
                System.out.println("Ati: " + student.getName());
                System.out.println( "Jashi: " + student.getAge());
            }
        }
        return count;
    }
}
