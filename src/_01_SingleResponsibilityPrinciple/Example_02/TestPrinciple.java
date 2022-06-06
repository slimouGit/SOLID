package _01_SingleResponsibilityPrinciple.Example_02;

public class TestPrinciple {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.setAuthor("Illmi");
        b1.setName("Illmis world");
        b1.setText("Illmi is the best");
        new BookPrinter().printTextToConsole(b1.getText());
    }
}
