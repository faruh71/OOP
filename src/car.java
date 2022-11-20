public class car {
    public String brend;
    public String model;
    float engineVolume;
    String color;
    int year;
    String country;

    car(String brend, String model, float engineVolume, String color, String country, int year) {
        this.brend = brend;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (brend == null) {
            this.brend = "default";
        } else if (model == null) {
            this.model = "default";
        } else
            this.model = model;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else
            this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "Белый";
        } else
            this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else
            this.year = year;
        if (country == null) {
            this.country = "default";
        } else
            this.country = country;

    }

    @Override
    public String toString() {
        return brend + " " + model + " , " + year + " год выпуска , сборка " + country + " ," + color + " цвета , объем двигателя  " + engineVolume;
    }

    public static void avto() {
        for (int i = 0; i < Main.auto.length; i++) {
            if (Main.auto[i] != null) {
                System.out.println(Main.auto[i].toString());
            }
        }
    }
}
