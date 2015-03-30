import java.util.Scanner;

/**
 * Created by jc301595 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {

        Patients patients = new Patients();

        running:
        while (true) {

            System.out.println("\nBMI Manager");
            System.out.println("Please select from the following menu options: \n" +
                    "\t1. Add new patient\n" +
                    "\t2. View patient\n" +
                    "\t3. Update patient\n" +
                    "\t4. Remove patient\n" +
                    "\t5. Exit\n");

            System.out.print("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1: {
                    patients.add(createPatient(scanner));
                }
                break;

                case 2: {
                    if (patients.isEmpty()) {
                        System.out.println("\nDatabase is empty");
                    } else {
                        viewPatients(patients);
                    }
                    break;
                }
                case 3: {
                    updatePatient(patients, scanner);
                    break;
                }
                case 4:{
                    removePatient(patients, scanner);
                    break;
                }
                case 5: {
                    System.out.println("Good bye!");
                    break running;
                }
            }
        }}



    private static void removePatient(Patients patients, Scanner scanner){
    System.out.println("Enter patient name: ");
    String name = scanner.nextLine();
        patients.removePatientsWithName(name);
}

    private static void updatePatient(Patients patients, Scanner scanner) {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        Patient patient = patients.getPatientWithName(name);
        if (patient != null) {


            System.out.println("Enter new age: ");
            int age = scanner.nextInt();

            System.out.println("Enter new height: ");
            double height = scanner.nextDouble();

            System.out.println("Enter new weight: ");
            double weight = scanner.nextDouble();

            patient.setAge(age);
            patient.setHeight(height);
            patient.setWeight(weight);

        } else System.out.println("No patients exist with name \"" + name + "\"");
    }

    public static void viewPatients(Patients patients){
        for (int i = 0; i < patients.count(); ++i){
            Patient patient = patients.get(i);
            String message = String.format("Name: %s Age: %d BMI: %.2f", patient.getName(),patient.getAge(), patient.getBMI());
            System.out.println(message);
        }


    }
    private static Patient createPatient(Scanner scanner){
        System.out.println("Enter patient name: ");
        String name = scanner.nextLine();

        System.out.println("Enter patient age: ");
        int age = scanner.nextInt();

        System.out.println("Enter patient height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter patient weight: ");
        double weight = scanner.nextDouble();

        return new Patient(name, age, height, weight);

    }
        }
