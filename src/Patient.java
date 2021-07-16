import java.util.ArrayList;
public class Patient extends Person{
    private ArrayList<Contact> contacts;
    private ArrayList<Symptom> symptoms;

    public void addSymptom(Symptom symptom) {
        symptoms.add(symptom);
    }
    public String displayInfo() {
        return  "Name: " + getName() + "\n" +
                "Phone: " + getPhone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "City: " + getCity() + "\n" +
                "State: " + getState() + "\n";

    }
}
