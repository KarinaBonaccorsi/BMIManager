import java.util.ArrayList;

/**
 * Created by jc301595 on 23/03/15.
 */
public class Patients {
    ArrayList<Patient> records;

    public Patients(){
        records = new ArrayList<Patient>();
    }

    public int count(){
        return records.size();
    }

    public void add(Patient patient) {
        records.add(patient);
    }

    public Patient get(int i) {
        return records.get(i);
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }

    public Patient getPatientWithName(String name){
        for (Patient patient : records){
            if(patient.getName().equals(name)){
                return patient;
            }
        }
        return null;
    }

    public void removePatientsWithName(String name){
        for(int i = 0; i < records.size(); ++i){
            if(records.get(i).getName().equals(name)){
                records.remove(i);
                --i;
            }
        }
    }


}
