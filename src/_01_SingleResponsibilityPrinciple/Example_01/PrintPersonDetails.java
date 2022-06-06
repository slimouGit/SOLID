package _01_SingleResponsibilityPrinciple.Example_01;

public class PrintPersonDetails {
    public void printPersonDetails(Person person){
        System.out.println("Vorname " + person.getFirstname());
        System.out.println("Nachname " + person.getLastname());
    }
}
