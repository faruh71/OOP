import java.util.Objects;

public class flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public flower(String name, String country, String flowerColor, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый ";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost > 0) {
            this.cost=cost;
        }else {
            this.cost=1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый ";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "название цветка: " + getName() + ", из " + getCountry() + ", цвет " + getFlowerColor() + " , стоимость штуки -  " + getCost() + " рублей, " + " срок состояния - " + lifeSpan;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        flower flower = (flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Objects.equals(name, flower.name) && Objects.equals(flowerColor, flower.flowerColor) && Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flowerColor, country, cost, lifeSpan);
    }

}
