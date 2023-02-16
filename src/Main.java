import java.time.LocalDate;
import java.util.logging.LoggingPermission;

public class Main {
    public static void main(String[] args) {
        /**   Класс Java (name, age, gender, email) түзүңүз
         Класс Android (name, age, gender, email) түзүңүз
         Класс Go (name, age, gender, email) түзүңүз
         Жогорудагы 3 класс бир класстан мурасталсын.
         Класс Company(address, java, android, go, ownerName)
         Мейн класстан эки компания түзүңүз
         Биринчи компанияда 5 жава, 3 андроид, 2 gо программист иштесин
         Экинчи компанияда 2 жава, 1 андроид, 1 go программист иштесин
         Компанияларды консольго чыгарыңыз*/

        Java java1 = new Java("Sanzhar Abdymomunov", LocalDate.of(2003, 10, 7),
                'M', "sanadylov@gmail.com");
        Java java2 = new Java("Nuradil Zholdoshev", LocalDate.of(2003, 3, 9),
                'M', "nurik@gmail.com");
        Java java3 = new Java("Ilim Shabdanov", LocalDate.of(2003, 9, 7),
                'M', "shabdanovilim@gmail.com");
        Java java4 = new Java("Dastan Akbarakiev", LocalDate.of(2003, 6, 19),
                'M', "dosya@gamil.com");
        Java java5 = new Java("Alibek Altybek uulu", LocalDate.of(2000, 8, 16),
                'M', "alibek@gmail.com");
        Java java6 = new Java("Nurseit Sadirov",LocalDate.of(2007,6,17),
                'M',"nurseit@gmail.com");
        Java java7 = new Java("Temirlan Zhuzukulov",LocalDate.of(2000,6,16),
                'M',"temirlan@gmail.com");

      Java [] javas ={java1, java2, java3, java4, java5};
      Java [] javas1 = {java6,java7};

        Android android1 = new Android("Stan", LocalDate.of(1998, 3, 7),
                'M', "stan@gmail.com");
        Android android2 = new Android("Sara", LocalDate.of(1999, 12, 7),
                'F', "sara@gamil.com");
        Android android3 = new Android("Aarav",LocalDate.of(1995,8,9),
                'M',"aarav@gamail.com");
        Android android4 = new Android("Aizat Duisheeva",LocalDate.of(2003,9,15),
                'F',"aizat@gmail.com");

        Android [] androids = {android1,android2,android3};
        Android [] androids1 = {android4};

        Go go1 = new Go("Lusi",LocalDate.of(1984,6,7),
                'F',"lusi@gmail.com");
        Go go2 = new Go("Mia",LocalDate.of(1990,7,23),
                'F',"mia@email.com");
        Go go3 = new Go("Deep",LocalDate.of(1994,6,8),
                'M',"deep@gmail.com");
        Go [] gos = {go1,go2};
        Go [] gos1 = {go3};


        Company company = new Company("Bishkek","Esen Niazov",
                javas,androids ,gos );
        Company company1 = new Company("Bishkek","Dastan Abdymomunov",
                javas1,androids1,gos1);

        System.out.println(company);
        System.out.println(company1);









    }
}