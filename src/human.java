public class human {
    String name;
    String jobTitle;
    String town;
    int yearOfBirth;


    public human(String name, String town, String jobTitle, int yearOfBirth) {
        if (name == null) {
            name = "информация не указана";
        } else if (town == null) {
            town = "информация не указана";
        } else if (jobTitle == null) {
            jobTitle = "Информация не указана";
        }
        this.name = name;
        this.jobTitle = jobTitle;
        this.town = town;
        this.yearOfBirth = yearOfBirth;

    }
    public int getYearOfBirth() {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут  " + town + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году." + " я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public static void list() {
        for (int i = 0; i < Main.field.length; i++) {
            if (Main.field[i] != null) {
                System.out.println(Main.field[i].toString());
            }
        }
    }
}