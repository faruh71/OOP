package transport;

import java.time.LocalDate;

public class car {
    car[] auto;
    private String brend;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;
    private String tansmission;
    private String bodyType;
    private String registracionNomber;

    private int seatsCount;
    private boolean season;
    private Key key;
    private Insurance insurance;


    public static class Key {
        private final boolean distanceAngine;
        private final boolean keylesAccess;

        public Key(boolean distanceRngine, boolean keylesAccess) {
            this.distanceAngine = distanceRngine;
            this.keylesAccess = keylesAccess;

        }

        public Key() {
            this(false, false);
        }

        public boolean isDistanceRngine() {
            return distanceAngine;
        }

        public boolean isKeylesAccess() {
            return keylesAccess;


        }
    }

    public static class Insurance {
        private final LocalDate validatiPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validatiPeriod, double cost, String number) {
            if (validatiPeriod == null) {
                this.validatiPeriod = LocalDate.now().plusDays(365);
            } else
                this.validatiPeriod = validatiPeriod;

            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else
                this.number = number;
        }

        public Insurance() {
            this(null, 9990, null);
        }

        public LocalDate getValidatiPeriod() {
            return validatiPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNunber() {
            return number;
        }

        public void term() {
            if (validatiPeriod.isBefore(LocalDate.now()) || validatiPeriod.isEqual(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void accuracy() {
            if (number.length() != 9) {
                System.out.println("номер страховки не корректный !");
            }
        }
    }

    public car(String brend, String model, float engineVolume, String color, String country, int year, String tansmission,
               String bodyType, String registracionNomber, int seatsCount, boolean season) {

        this.brend = brend;
        this.model = model;

        if (brend == null) {
            this.brend = "default";
        } else if (model == null) {
            this.model = "default";
        } else
            this.model = model;
        this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "Белый";
        } else
            this.color = color;

        if (year <= 0) {
            year = 2000;
        } else
            year = year;
        this.year = year;
        if (country == null) {
            this.country = "default";
        } else
            this.country = country;

        if (seatsCount <= 0) {
            this.seatsCount = 5;
        } else {
            this.seatsCount = seatsCount;
        }
        if (tansmission != null && !tansmission.isEmpty() && !tansmission.isBlank()) {
            this.tansmission = tansmission;
        } else {
            this.tansmission = "механика";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = " седан";
        }
        if (registracionNomber != null && !registracionNomber.isEmpty() && !registracionNomber.isBlank()) {
            this.registracionNomber = registracionNomber;
        } else {
            this.registracionNomber = "х000хх000";
        }
        this.season = !season;

      //  if (key == null) {
        //            this.key = new Key();
        //        } else {
        //            this.key = key;
        //        }
        //        if (insurance == null) {
        //            this.insurance = insurance;
        //        } else {
        //            this.insurance = insurance;
        //        }

    }

    public car(String brend, String model, float engineVolume, String color, String country, int year) {
        this(brend, model, engineVolume, color, country, year, "mkpp", "sedan", "х000хх000", 5,true);

    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public String getCountry() {
        return country;
    }

    public boolean isSeason() {
        return season;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTansmission() {
        return tansmission;
    }

    public void setTansmission(String tansmission) {
        if (tansmission == null) {
            this.tansmission = "механика";
        } else
            this.tansmission = tansmission;
    }

    public void setRegistracionNomber(String registracionNomber) {
        if (registracionNomber == null) {
            this.registracionNomber = "х000хх000";
        } else
            this.registracionNomber = registracionNomber;
    }

    public String getRegistracionNomber() {
        return registracionNomber;
    }

    public void setSeason(boolean season) {
        this.season = season;
    }

    public void seasons() {
        season = !season;

    }

    public boolean correct() {
        if (registracionNomber.length() != 9) {
            return false;
        }
        char chars[] = registracionNomber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return brend + " " + getModel() + " , " + getYear() + " год выпуска , сборка " + getCountry() + " ," + getColor() + " цвета , объем двигателя  " + getEngineVolume() +
                ",коробка " + getTansmission() + ",кузов" + getBodyType() + ",гоc номер" + getRegistracionNomber() + ",вместимость =" + getSeatsCount() + "," +
                " резина " + (isSeason() ? "летняя резина" : "зимняя резина")+", ";
    }

}