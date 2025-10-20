import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);  

        while(true) {
            System.out.println("\n=====Student Mangement System=====\n");
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Update the score");
            System.out.println("4. Delete the student");
            System.out.println("5. Exit the system");
            System.out.println("Please choose the option(1-5): ");
            String choice = scanner.nextLine();
            switch(choice) {
                case "1" -> manager.addStudent();
                case "2" -> manager.listStudents();
                case "3" -> manager.updateStudent();
                case "4" -> manager.deleteStudent();
                case "5" -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid input, please type 1-5.");
            }
        }
    }
}
