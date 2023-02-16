import java.util.Arrays;

public class Company {
    private String address;
    private String ownerName;
    private Java[] javas;
    private Android[] androids;
    private Go[] gos;

    public Company(String address, String ownerName, Java[] java, Android[] androids, Go[] gos) {
        this.address = address;
        this.ownerName = ownerName;
        this.javas = java;
        this.androids = androids;
        this.gos = gos;
    }

    public String javaToString() {
        String javaToString = "";
        for (Java j : javas) {
            javaToString += j.toString();
        }
        return javaToString;
    }

    public String androidToString() {
        String androidToString = "";
        for (Android a : androids) {
            androidToString += a.toString();
        }
        return androidToString;
    }

    public String goToString() {
        String goToSting = "";
        for (Go g : gos) {
            goToSting += g.toString();
        }
        return goToSting;
    }


    @Override
    public String toString() {
        return "\nCompany: " +
                "\nAddress: " + address +
                "\nOwnerName: " + ownerName +
                "\n~~~~~~~~~~~~~~~" +
                "\n\nJava dev\n" +
                javaToString() +
                "\n~~~~~~~~~~~~~~~\n" +
                "\n\nAndroid dev\n" +
                androidToString() +
                "\n~~~~~~~~~~~~~~~\n" +
                "\n\nGo dev\n" +
                  goToString();

    }

}
