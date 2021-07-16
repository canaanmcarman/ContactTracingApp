public class Symptom {
    private String nameOfSymptom;
    private int daysHadSymptom;
    private boolean hasSymptom;

    public Symptom() {
        this.nameOfSymptom = "";
        this.daysHadSymptom = 0;
        this.hasSymptom = false;
    }
    public Symptom(String nameOfSymptom) {
        this.nameOfSymptom = nameOfSymptom;
        this.daysHadSymptom = 0;
        this.hasSymptom = false;
    }
    public void setNameOfSymptom(String nameOfSymptom) {
        this.nameOfSymptom = nameOfSymptom;
    }
    public String getNameOfSymptom () {
        return this.nameOfSymptom;
    }
    public void setDaysHadSymptom(int days) {
        this.daysHadSymptom = days;
    }
    public int getDaysHadSymptom() {
        return this.daysHadSymptom;
    }
    public void setHasSymptom(boolean hasSymptom) {
        this.hasSymptom = hasSymptom;
    }
    public boolean getHasSymptom() {
        return this.hasSymptom;
    }
}
