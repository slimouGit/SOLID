package _01_SingleResponsibilityPrinciple.Example_01;

public class Student {
    private String registerNumber;

    public Student() {
    }

    public Student(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
}
