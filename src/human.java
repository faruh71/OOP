import java.time.LocalDate;

public class human {
    private String name;
    private String jobTitle;
    private String town;
    private int yearOfBirth;

    public human(String name, String town, String jobTitle, int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        this.jobTitle = jobTitle;
        this.town = town;
    }

    public String getName() {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "(информация не указана)";
        }
        return name;
    }

    public String getJobTitle() {
        if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "(информация не указана)";
        }
        return jobTitle;
    }

    public String getTown() {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "(информация не указана)";
        }
        return town;
    }

    public int getYearOfBirth() {
        if (yearOfBirth >= 1900) {
            this.yearOfBirth = yearOfBirth;
        } else   if (yearOfBirth < 150) {
            return this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } return this.yearOfBirth = Math.abs(yearOfBirth);
    }

    public void setYearOfBirth(int yearOfBirth) {

        if (yearOfBirth == 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут  " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth()+ " году." + " я работаю на должности " + getJobTitle() + ". Будем знакомы!";
    }

    public static void list() {
        for (int i = 0; i < Main.field.length; i++) {
            if (Main.field[i] != null) {
                System.out.println(Main.field[i].toString());
            }
        }
    }
}