public class Main {

    public static human[] field;
    public static car[] auto;

    public static void main(String[] args) {
        field = new human[10];
        auto = new car[10];
        field[0] = new human("Максим", "минск", "бренд менеджером", 1988);
        field[1] = new human("Аня", " москва", " методистом оброзавателбных програм ", 1993);
        field[2] = new human("Катя ", " калиниград ", "продакт- менеджером", 1992);
        field[3] = new human("Артем", " москва", "директором по развитиюбизнеса ", 1995);
        field[4] = new human(null, null, null, 1995);
        human.list();
        System.out.println("\n");
        auto[0] = new car("Lada", null, 1.7f, "желтого", " Россия  ", 2015);
        auto[1] = new car("AUDI ", "A8 50 TDI quattro", 3.0f, "  ", "  ", 2020);
        auto[2] = new car("BMW", "Z8", 3.0f, "черный", "Гермения  ", 2021);
        auto[3] = new car("KIA", "Sportage 4-го поколения", 3.0f, " Черный  ", "Южная Корея", 2018);
        auto[4] = new car("HYUNDAY ", "Avente", 1.6f, "оранжевый", " Южная Корея  ", 2016);
        auto[5] = new car(null, null, 0.0f, null, null, 0);
        car.avto();

    }
}