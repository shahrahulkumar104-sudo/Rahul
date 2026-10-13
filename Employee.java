package program;

public class Employee {

	import java.util.Scanner;
	    String name;
	    int age;
	    double salary;

	    void create(Scanner s) {
	        System.out.print("Enter name: ");
	        name = s.nextLine();

	        System.out.print("Enter age: ");
	        age = s.nextInt();

	        System.out.print("Enter salary: ");
	        salary = s.nextDouble();
	    }

	    void display() {
	        System.out.println("\nName: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	    }

	    void raiseSalary(Scanner s) {
	        System.out.print("Enter raise percentage: ");
	        double p = s.nextDouble();

	        salary = salary + salary * p / 100;

	        System.out.println("New Salary: " + salary);
	    }
	}

	public class EmployeeManagement {
	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        Employee e = new Employee();
	        int ch;

	        do {
	            System.out.println("\n1. Create");
	            System.out.println("2. Display");
	            System.out.println("3. Raise Salary");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            ch = s.nextInt();
	            s.nextLine();

	            switch (ch) {
	                case 1:
	                    e.create(s);
	                    break;

	                case 2:
	                    e.display();
	                    break;

	                case 3:
	                    e.raiseSalary(s);
	                    break;

	                case 4:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }

	        } while (ch != 4);

	        s.close();
	    }
	}


