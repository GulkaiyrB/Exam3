import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Contact extends AbstractNote implements WriteToFile {
    private String phoneNumber;
    private String nameOfContact;
    private PhoneNumberType phoneNumberType;

    public Contact(String nameOfContact, String phoneNumber, PhoneNumberType phoneNumberType, NoteType noteType, String text, LocalDate date) {
        super(text, date, noteType);
        this.phoneNumber = phoneNumber;
        this.nameOfContact = nameOfContact;
        this.phoneNumberType = phoneNumberType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public void setNameOfContact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }

    public PhoneNumberType getTypeOfNumber() {
        return phoneNumberType;
    }

    public void setTypeOfNumber(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    @Override
    public void createRecord() {
        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt", true);
            fileWriter.write(this.toString());
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "\nИнформация о контакте: " +
                "\nНомер телефона: " + phoneNumber +
                "\nИмя контакта: " + nameOfContact +
                "\nТип номера: " + phoneNumberType +
                "\nТекст: " + super.getText() +
                "\nДата создания: " + super.getDate() +
                "\nТип заметки: " + super.getTypeOfNote() +
                "\n";
    }
}
