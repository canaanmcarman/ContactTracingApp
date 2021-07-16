import com.sun.org.apache.xerces.internal.util.SymbolTable;

import java.util.Scanner;
import java.util.ArrayList;
public class ContactTracingApp {
    public static void main(String[] args) {
        Patient patient = new Patient();
        ArrayList<String> symptoms = new ArrayList<>();



        Scanner kbd = new Scanner(System.in);
        String ans = "";

        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected person's information\nWhat is a patient's name?");
        patient.setName(kbd.nextLine());
        System.out.println("What is their phone number?");
        patient.setPhone(kbd.nextLine());
        System.out.println("What is the patient's email?");
        patient.setEmail(kbd.nextLine());
        System.out.println("What city does the patient live in?");
        patient.setCity(kbd.nextLine());
        System.out.println("What state does the patient live in?");
        patient.setState(kbd.nextLine());


        //Adding all the symptoms our program is looking for to symptoms arraylist
        symptoms.add("Fever");
        symptoms.add("Cough");
        symptoms.add("Shortness of breath or Difficulty breathing");
        symptoms.add("Tiredness");
        symptoms.add("Aches");
        symptoms.add("Chills");
        symptoms.add("Sore throat");
        symptoms.add("Loss of smell");
        symptoms.add("Loss of taste");
        symptoms.add("Headache");
        symptoms.add("Diarrhea");
        symptoms.add("Severe vomiting");
        //now looping through symptoms to ask patient ifnormation about each symptom they might have
        for (String symptomName:symptoms) {
            Symptom symptom = new Symptom(symptomName);
            System.out.println("Does this patient have any symptom for " + symptomName + "? (y/n)");
            ans = kbd.nextLine();
            if (ans.equalsIgnoreCase("y")){
                System.out.println("How long has patient had symptom for? ");
                symptom.setDaysHadSymptom(kbd.nextInt());
                kbd.nextLine();
                patient.addSymptom(symptom);

        }
    }



        //asking user if they had contact with anyone and if so, adding them to a list of contacts
        System.out.println("Has this patient met or run into anyone? (y/n)");
        ans = kbd.nextLine();
        while (ans.equalsIgnoreCase("y")){
            Contact contact = new Contact();
            System.out.println("What is his/her name? ");
            contact.setName(kbd.nextLine());
            System.out.println("What is his/her phone number? ");
            contact.setPhone(kbd.nextLine());
            System.out.println("What is his/her email?");
            contact.setEmail(kbd.nextLine());

            System.out.println("Did this patient meet or run into anyone else?");
            ans = kbd.nextLine();
            patient.addContact(contact);
        }


        //Displaying contact tracing report to user
        System.out.println("***** Contact Tracing Report *****");
        System.out.println(patient.displayInfo());
        System.out.println("**\t\tSymptoms: \n");

        for (Symptom symptom:patient.getSymptoms()){
            System.out.println(symptom.getNameOfSymptom() + " for " + symptom.getDaysHadSymptom() + " days");
        }

        System.out.println("\n**\t\tContacts: ");
        for (Contact contact:patient.getContacts()){
            System.out.println(contact.getDetails());
        }








    }
}
