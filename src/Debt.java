import java.math.BigDecimal;
import java.time.LocalDate;

public class Debt extends AbstractNote implements noteFile{
    BigDecimal sumOfDebt;


    public Debt(String text, LocalDate date, TypeMobile type, double sumOfDebt) {
        super(text, date, type);
        this.sumOfDebt = BigDecimal.valueOf(sumOfDebt);
    }

    public BigDecimal getSumOfDebt() {
        return sumOfDebt;
    }

    public void setSumOfDebt(BigDecimal sumOfDebt) {
        this.sumOfDebt = sumOfDebt;
    }

    @Override
    public void takeNote() {
        System.out.println(this.getText() + " " + this.getDate() + " " + this.getSumOfDebt());
    }
}
