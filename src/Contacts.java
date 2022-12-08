import java.time.LocalDate;

public class Contacts extends AbstractNote implements noteFile{
    private String phone;
    private String name;


    public Contacts(String text, LocalDate date, TypeMobile type, String phone, String name) {
        super(text, date, type.getType());
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void takeNote() {
        System.out.println(this.getText() + " "  + this.getDate() + " " + this.getPhone() + " " + this.getName());
    }
}
