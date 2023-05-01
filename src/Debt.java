import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Debt extends Note implements WriteToFile {
    private BigDecimal debt;

    public Debt(String headLine, LocalDate date, NoteType noteType, String text, BigDecimal debt) {
        super(headLine, date, noteType, text);
        this.debt = debt;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
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
        return
                "\nЗаголовок: " + super.getHeadLine() +
                        "\nТекст: " + super.getText() +
                        "\nДата создания: " + super.getDate() +
                        "\nТип заметки: " + super.getTypeOfNote() +
                        "\nСумма долга: " + debt +
                        "\n";
    }
}
