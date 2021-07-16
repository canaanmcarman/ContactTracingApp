public class Contact extends Person{

    public Contact() {
        super();
    }

    public String getDetails() {
        return  "Name: " + this.getName() + "\n" +
                "Phone: " + this.getPhone() + "\n" +
                "Email: " + this.getEmail() + "\n" ;

    }


}
