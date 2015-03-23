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
                    addPatient(patient, scanner);
                    break;
                }
                case 2: {
                    viewPatient(patient);
                    break;

                }

                case 3: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }
    }



    public static void viewPatient(Patient patient){
        String message = String.format("Name: %s Age: %d BMI: %f", patient.getName(),patient.getAge(), patient.getBMI());
        System.out.println(message);
    }
    public static void addPatient(Patient patient, Scanner scanner){
        System.out.println("Enter patient name: ");
        patient.setName(scanner.nextLine());

        System.out.println("Enter patient age: ");
        patient.setAge(scanner.nextInt());

        System.out.println("Enter patient height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter patient weight: ");
        double weight = scanner.nextDouble();
        patient.setDetails(height, weight);

    }



        }
