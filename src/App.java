import java.util.Scanner;

/**
 * Created by jc301595 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {

        Patient patient = new Patient();

        running:
        while (true) {

            System.out.println("BMI Manager");
            System.out.println("Please select from the following menu options: \n" +
                    "\t1. Add new patient\n" +
                    "\t2. View patient\n" +
                    "\t3. Exit\n");

            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1: {
                    patient.setName(scanner.nextLine());
                    patient.setAge(scanner.nextInt());
                    patient.setDetails(scanner.nextDouble(), scanner.nextDouble());
                    break;
                }
                case 2: {
                    System.out.println(String.format("Name: %s  Age: %d  BMI: %f", patient.getName(),patient.getAge(), patient.getBMI()));

                }

                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }

        }
    }
}