
public class Person {
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;

    public Person() {
        this.name = "";
        this.email = "";
        this.phone = "";
        this.city = "";
        this.state = "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }


}
