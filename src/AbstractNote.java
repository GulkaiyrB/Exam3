import java.time.LocalDate;

public abstract class AbstractNote {
    private String text;
    private LocalDate date;
    private NoteType noteType;

    public AbstractNote(String text, LocalDate date, NoteType noteType) {
        this.text = text;
        this.date = date;
        this.noteType = noteType;
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

    public NoteType getTypeOfNote() {
        return noteType;
    }

    public void setTypeOfNote(NoteType noteType) {
        this.noteType = noteType;
    }

    @Override
    public String toString() {
        return "AbstractNote{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", noteType=" + noteType +
                '}';
    }
}

