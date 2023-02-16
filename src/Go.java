import java.time.LocalDate;

public class Go extends Developer{
    public Go( String name, LocalDate dayOfBirth, char gender,  String email) {
        super( name, dayOfBirth, gender,  email);
    }

    public Go() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
