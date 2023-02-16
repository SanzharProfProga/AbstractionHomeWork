import java.time.LocalDate;

public class Android extends  Developer{
    public Android( String name, LocalDate dayOfBirth, char gender, String email) {
        super(name, dayOfBirth, gender, email);
    }

    public Android() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
