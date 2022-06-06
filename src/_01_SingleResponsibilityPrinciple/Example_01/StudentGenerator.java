package _01_SingleResponsibilityPrinciple.Example_01;

public class StudentGenerator {
    private Student student;
    private Person person;

    public StudentGenerator() {
    }

    public StudentGenerator(Student student, Person person) {
        this.student = student;
        this.person = person;
    }

    @Override
    public String toString() {
        return "StudentGenerator{" +
                "student=" + student.getRegisterNumber() +
                ", person vorname=" + person.getFirstname() +
                ", person nachnamne=" + person.getLastname() +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
