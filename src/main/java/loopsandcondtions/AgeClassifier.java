import java.util.Scanner;
public class AgeClassifier {

    public static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age:");
        int personAge = sc.nextInt();
        classifyAge(personAge);
        sc.close();
    }
}
