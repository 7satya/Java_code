import MyPackage.PackageClass;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public Employee() {
        firstName = "Satya";
        lastName = "Prakash";
        salary = 37500.00;
    }

    public static void main(String[] args) {
        Employee EmpObj = new Employee();
        System.out.println("The name is: " + EmpObj.firstName + " " + EmpObj.lastName);
        System.out.println("The monthly salary is: " + EmpObj.salary);

        EmpObj.setFirstName("Pratibha");
        EmpObj.setLastName("Bharti");
        EmpObj.setSalary(4500.00);

        System.out.println(EmpObj.getFirstName() + " " + EmpObj.getLastName() + ": " +EmpObj.getSalary());

        PackageClass IntClass = new PackageClass();
        System.out.println("Entered number is: " +IntClass.returnNum());
    }
}
