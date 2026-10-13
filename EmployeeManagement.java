package rahul;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double yes;

    void create(Scanner s) {
        System.out.print("Enter name: ");
        name = s.nextLine();

        System.out.print("Enter age: ");
        age = s.nextInt();

        System.out.print("Enter initial value for yes: ");
        yes = s.nextDouble();
        s.nextLine(); // consume newline
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Yes: " + yes);
    }

    void option(Scanner s) {
        System.out.print("Enter percentage to increase yes: ");
        double p = s.nextDouble();
        s.nextLine(); // consume newline

        yes = yes + yes * p / 100;

        System.out.println("New yes: " + yes);
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
            System.out.println("3. Option1");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            ch = s.nextInt();
            s.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    e.create(s);
                    break;

                case 2:
                    e.display();
                    break;

                case 3:
                    e.option(s);
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
