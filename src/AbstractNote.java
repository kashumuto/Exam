import java.time.LocalDate;

public abstract class AbstractNote {
    private String text;
    private LocalDate date;
    private TypeMobile type;

    public AbstractNote(String text, LocalDate date, TypeMobile type) {
        this.text = text;
        this.date = date;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeMobile getType() {
        return type;
    }

    public void setType(TypeMobile type) {
        this.type = type;
    }
}
