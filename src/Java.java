import java.time.LocalDate;

public class Java extends Developer {
    public Java( String name, LocalDate dayOfBirth, char gender, String email) {
        super( name, dayOfBirth,gender, email);
    }

    public Java() {
        super();

    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

}
