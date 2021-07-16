import com.sun.org.apache.xerces.internal.util.SymbolTable;

import java.util.Scanner;
import java.util.ArrayList;
public class ContactTracingApp {
    public static void main(String[] args) {
        Patient patient = new Patient();
        ArrayList<Contact> contacts = new ArrayList<>();
        ArrayList<Symptom> symptoms = new ArrayList<>();
        Symptom fever = new Symptom("Fever");
        Symptom cough = new Symptom("Cough");
        Symptom difficultyBreathing = new Symptom("Difficulty Breathing");
        Symptom tiredness = new Symptom("Tiredness");
        Symptom aches = new Symptom("Aches");
        Symptom chills = new Symptom("Chills");
        Symptom soreThroat = new Symptom("Sore Throat");
        Symptom lossOfSmell = new Symptom("Loss of smell");
        Symptom lossOfTaste = new Symptom("Loss of taste");
        Symptom headache = new Symptom("Headache");
        Symptom diarrhea = new Symptom("Diarrhea");
        Symptom severeVomiting = new Symptom("Severe Vomiting");



        Scanner kbd = new Scanner(System.in);
        String ans = "";
        int days = 0;




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

        System.out.println(patient.displayInfo());

        System.out.println("Does this patient have any symptom for Fever? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {

            fever.setHasSymptom(true);
            symptoms.add(fever);
            System.out.println("How long has this patient had this symptom for?");
            fever.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {fever.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Cough? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {

            cough.setHasSymptom(true);
            symptoms.add(cough);
            System.out.println("How long has this patient had this symptom for?");
            cough.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {cough.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom Shortness of breath or Difficulty breathing? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            difficultyBreathing.setHasSymptom(true);
            symptoms.add(difficultyBreathing);
            System.out.println("How long has this patient had this symptom for?");
            difficultyBreathing.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {difficultyBreathing.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Tiredness? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            tiredness.setHasSymptom(true);
            symptoms.add(tiredness);
            System.out.println("How long has this patient had this symptom for?");
            tiredness.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {tiredness.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Aches (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            aches.setHasSymptom(true);
            symptoms.add(aches);
            System.out.println("How long has this patient had this symptom for?");
            aches.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {aches.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Chills? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            chills.setHasSymptom(true);
            symptoms.add(chills);
            System.out.println("How long has this patient had this symptom for?");
            chills.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {chills.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Sore throat? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            soreThroat.setHasSymptom(true);
            symptoms.add(soreThroat);
            System.out.println("How long has this patient had this symptom for?");
            soreThroat.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {soreThroat.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Loss of smell? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            lossOfSmell.setHasSymptom(true);
            symptoms.add(lossOfSmell);
            System.out.println("How long has this patient had this symptom for?");
            lossOfSmell.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {lossOfSmell.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Loss of taste? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            lossOfTaste.setHasSymptom(true);
            symptoms.add(lossOfTaste);
            System.out.println("How long has this patient had this symptom for?");
            lossOfTaste.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {lossOfTaste.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Headache? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            headache.setHasSymptom(true);
            symptoms.add(headache);
            System.out.println("How long has this patient had this symptom for?");
            headache.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {headache.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Diarrhea? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            diarrhea.setHasSymptom(true);
            symptoms.add(diarrhea);
            System.out.println("How long has this patient had this symptom for?");
            diarrhea.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {diarrhea.setHasSymptom(false);}

        System.out.println("Does this patient have any symptom for Severe vomiting? (y/n)");
        ans = kbd.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            severeVomiting.setHasSymptom(true);
            symptoms.add(severeVomiting);
            System.out.println("How long has this patient had this symptom for?");
            severeVomiting.setDaysHadSymptom(kbd.nextInt());
            kbd.nextLine();
        }else {severeVomiting.setHasSymptom(false);}



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
            contacts.add(contact);
        }

        System.out.println("Symptoms: ");
        for (Symptom symptom:symptoms) {
            if (symptom.getHasSymptom() == true){
                System.out.println("had " + symptom.getNameOfSymptom() + " for " + symptom.getDaysHadSymptom() + " days");
            }
        }

        System.out.println("\nContacts: ");
        for (Contact contact:contacts){
            System.out.println(contact.getDetails());
        }








    }
}
