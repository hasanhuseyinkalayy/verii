package practice_1;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee empOne = new Employee("Hasan hüseyin");
        Employee empTwo = new Employee("KALAY");

        empOne.setAge(21);
        empOne.setDesignation("Senior Software Engineer");
        empOne.setSalary(1000);
        empOne.printEmployee();

        empTwo.setAge(15);
        empTwo.setDesignation("Software Engineer");
        empTwo.setSalary(500);
        empTwo.printEmployee();
    }
}