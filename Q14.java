import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    void calculateGrossSalary() {
        double hra = basic_salary * 0.20; 
        double da = basic_salary * 0.50;
        gross_salary = basic_salary + hra + da;
    }
    void displayDetails() {
        System.out.println("   Employee details   ");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Employee e1 = new Employee();
        System.out.print("Enter Employee ID: ");
        e1.emp_id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        e1.emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        e1.basic_salary = sc.nextDouble();
        e1.calculateGrossSalary();
        e1.displayDetails();

    }
}
