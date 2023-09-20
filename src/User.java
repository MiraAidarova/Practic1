import org.w3c.dom.ls.LSOutput;

public class User {
    private String name;
    private String dateOfBrith;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
      //  System.out.println("Атыныз: ");
        this.name = name;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
       // System.out.println("Туулган жылыныз: ");
        this.dateOfBrith = dateOfBrith;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
       // System.out.println("Телефон номериниз: ");
        this.phoneNumber = phoneNumber;
    }
}
