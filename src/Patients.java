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

}
