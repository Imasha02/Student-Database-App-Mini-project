import java.util.Scanner;
import java.util.List;

public class StudentApp {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentDAO studentDAO = new StudentDAO();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Database ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        studentDAO.addStudent(new Student(name, age, email));
    }

    private static void viewStudents() {
        List<Student> students = studentDAO.getAllStudents();
        System.out.println("\nID | Name | Age | Email");
        System.out.println("-------------------------");
        for (Student s : students) {
            System.out.printf("%d | %s | %d | %s%n", 
                s.getId(), s.getName(), s.getAge(), s.getEmail());
        }
    }

    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new email: ");
        String email = scanner.nextLine();
        boolean updated = studentDAO.updateStudent(new Student(id, name, age, email));
        System.out.println(updated ? "Student updated!" : "Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean deleted = studentDAO.deleteStudent(id);
        System.out.println(deleted ? "Student deleted!" : "Student not found.");
    }
}
