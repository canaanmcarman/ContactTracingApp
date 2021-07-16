import java.util.ArrayList;
public class Patient extends Person{
    private ArrayList<Contact> contacts;
    private ArrayList<Symptom> symptoms;

    public Patient() {
        this.contacts = new ArrayList<>();
        this.symptoms = new ArrayList<>();
    }

    public void addSymptom(Symptom symptom) {
        this.symptoms.add(symptom);
    }
    public ArrayList<Symptom> getSymptoms() {
        return this.symptoms;
    }
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    public ArrayList<Contact> getContacts (){
        return this.contacts;
    }
    public String displayInfo() {
        return  "Name: " + getName() + "\n" +
                "Phone: " + getPhone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "City: " + getCity() + "\n" +
                "State: " + getState() + "\n";

    }
}
