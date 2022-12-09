import transport.car;

public class Main {

    public static human[] field;
    public static car[] auto;

    //  public static flower[] flovers;
    public static void main(String[] args) {
        field = new human[10];
        field[0] = new human("Максим", "минск", "бренд менеджером", 1988);
        field[1] = new human("Аня", " москва", " методистом оброзавателбных програм ", 1993);
        field[2] = new human("Катя ", " калиниград ", "продакт- менеджером", 1992);
        field[3] = new human("Артем", " москва", "директором по развитиюбизнеса ", 1995);
        field[4] = new human(null, null, null, 47);
        field[5] = new human("Владимир", "казань", "", 21);
        //  human.list();
        System.out.println("\n");
        car lada = new car( "Lada", null, 1.7f, "желтого", " Россия  ", 2015);
        car audi = new car( "AUDI ", "A8 50 TDI quattro", 3.0f, "  ", "  ", 2020);
        car bmw = new car( "BMW", "Z8", 3.0f, "черный", "Гермения  ", 2021);
        car kia = new car( "KIA", "Sportage 4-го поколения", 3.0f, " Черный  ", "Южная Корея", 2018);
        car hyunday = new car( "HYUNDAY ", "Avente", 1.6f, "оранжевый", " Южная Корея  ", 2016 );
        car hyundayC = new car( "HYUNDAY ", "Avenсе", 1.6f, "оранжевый", " Южная Корея  ", 2016
                , "мкпп" ,"хэтчбек","ы555фы874",4,true);

        System.out.println(lada+"\n" + audi+"\n" + bmw+"\n" + kia+"\n" + hyunday);

        flower roza = new flower("Роза обыкновенная", "Голландии","" ,35.59 , 0);
        flower hrizontem = new flower("хризонтема", "","" , 15, 5);
        flower pion  = new flower("пион", "англии","" , 69.9, 1);
        flower giposfil = new flower("гипосфила", "Турции","" , 19.5, 10);
       // System.out.println(roza +"\n" +hrizontem +"\n" + pion +"\n" + giposfil);
    }
}
