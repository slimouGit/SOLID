package _01_SingleResponsibilityPrinciple.Example_01;

public class TestPrinciple {
    public static void main(String[] args){
        Person p1 = new Person("Mimi","Illmi");
        Student s1 = new Student("42");
        PrintPersonDetails printPersonDetails = new PrintPersonDetails();
        printPersonDetails.printPersonDetails(p1);
        StudentGenerator studentGenerator = new StudentGenerator(s1,p1);
        System.out.println(studentGenerator);
    }
}
