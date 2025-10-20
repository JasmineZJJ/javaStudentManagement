import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
public void addStudent() {
    System.out.print("Please enter your student ID: ");
    String id = scanner.nextLine();

    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Please enter your score: ");
    int score = Integer.parseInt(scanner.nextLine());

    Student student = new Student(id, name, score);
    students.add(student);
    System.out.println("Successfully add!");
}
public void listStudents() {
    if(students.isEmpty()) {
        System.out.println("No students information.");
        return;
    }
    System.out.println("StudentID\tname\tscore");
    for(Student stud : students) {
        System.out.println(stud.getId() + "\t" + stud.getName() + "\t" + stud.getScore());
    }
} 
public void updateStudent() {
    System.out.print("Please type in the student ID you would like to modify: ");
    String id = scanner.nextLine();

    for(Student stud : students) {
        if(stud.getId().equals(id)){
            System.out.print("Please type in the new score: ");
            int newScore = Integer.parseInt(scanner.nextLine());
            stud.setScore(newScore);
            System.out.println("The score has been updated!");
            return;
        }
    }
    System.out.println("Failed to get the student!");
}
public void deleteStudent() {
    System.out.print("Please type in the student ID you would like to delete: ");
    String id = scanner.nextLine();

    for(Student stud : students) {
        if(stud.getId().equals(id)) {
            students.remove(stud);
            System.out.println("The student has been deleted.");
            return;
        }
    }
    System.out.println("Failed to get the student!");
}

}