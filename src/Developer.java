import java.time.LocalDate;
import java.time.Period;

public abstract class Developer {
    private String name;
    private LocalDate dayOfBirth;
    private char gender;
    private int age;
    private String email;

    public Developer( String name, LocalDate dayOfBirth, char gender, String email) {
        this.name = name;
        this.gender = gender;
        this.age = Period.between(dayOfBirth,LocalDate.now()).getYears();
        this.email = email;
    }

    public Developer() {
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nGender: " + gender +
                "\nAge: " + age +
                "\nEmail: " + email;
    }
}
