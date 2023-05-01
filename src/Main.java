import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Note note1 = new Note(" Заметка - 1: ", LocalDate.now(), NoteType.IDEAS, "Напоминание: Прием у врача.");
        Note note2 = new Note(" Заметка - 2: ", LocalDate.now(), NoteType.IDEAS, "Напоминание: Встреча.");

        Debt debt1 = new Debt("Долг-1: ", LocalDate.now(), NoteType.DEBT, " купила косметику ", new BigDecimal("5500"));
        Debt debt2 = new Debt("Долг-2: ", LocalDate.now(), NoteType.DEBT, "купила кроссы ", new BigDecimal("8000"));


        Contact contact1 = new Contact("Миша ", "+996555000035",
                PhoneNumberType.MOBILE, NoteType.IDEAS, "Отправить резюме.", LocalDate.now());
        Contact contact2 = new Contact("Маша", "+996312252525",
                PhoneNumberType.LANDLINE, NoteType.IDEAS, "Позвонить", LocalDate.now());
        Contact contact3 = new Contact("Олег", "+996555222222",
                PhoneNumberType.MOBILE, NoteType.DEBT, "Брал в долг", LocalDate.now());


        WriteToFile[] writeToFiles = {note1, note2, debt1, debt2, contact1, contact2, contact3};
        for (WriteToFile writeToFile : writeToFiles) {
            writeToFile.createRecord();
        }
        System.out.println("Запись успешно сохранена в файл NoteBook.txt");
    }
}
