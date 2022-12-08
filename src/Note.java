import java.time.LocalDate;

public class Note extends AbstractNote implements noteFile{
    private String heading;

    public Note(String text, LocalDate date, Note type, String heading) {
        super(text, date, type.getType());
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    @Override
    public void takeNote() {
        System.out.println("");
    }
}
