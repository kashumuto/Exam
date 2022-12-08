import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        getTypeOfNumber(TypeMobile.MOBILE);
        Debt debt = new Debt("Долг Амана", LocalDate.now(),TypeMobile.MOBILE, 12036545.36);
        debt.takeNote();

        Contacts contact = new Contacts("Contact",LocalDate.now(),TypeMobile.TELEPHONE,"0312-65-8-36","Ivan");
        contact.takeNote();


    }

     static void getTypeOfNumber(TypeMobile phone) {
        switch (phone) {
            case MOBILE:
                System.out.println("Введите номер с +996");
                break;
            case TELEPHONE:
                System.out.println("Введите номер с 0 312");
        }
    }

    static void getNoteType(NoteType type) {
        switch (type) {
            case DEBTS:
                System.out.println("пишем долг");
                break;
            case IDEAS:
                System.out.println("пишем идею");
        }
    }
}
