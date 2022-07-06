package pl.cyber.trainees;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleApp {

    enum Stan {on, off};
    enum Plec {kobieta, mezczyzna};
    public static void main(String[] args) {

        int scale = 0;

//praca domowa
        //Utworzenie 2 zmiennych typu String i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Integer i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Double i ich inicjalizacja

        //dodawanie , odejmowanie, monożenie i dzielenie.
        //proszę o wykonanie działania dzielenie przez 0

        roundNumber("2.34", scale);
        System.out.println("NEXT");
        roundNumber("2.44", scale);
        System.out.println("NEXT");
        roundNumber("2.46", scale);
        System.out.println("NEXT");
        roundNumber("2.5", scale);
        System.out.println("NEXT");
        roundNumber("2.55", scale);
        System.out.println("NEXT");
        roundNumber("2.6", scale);
        System.out.println("NEXT");
    }

    public static int add(int l1, int l2) {
        var result = l1 + l2;
        return result;

//        return l1 + l2;
    }

    public static String concat(String l1, String l2) {
        var result = l1 + l2 + "\n";
        return result;
    }

    public static void roundNumber(final String number, int scale) {  //To najczęstszy sposób gdzie ja stosuję zaokrąglanie liczb
        BigDecimal value = BigDecimal.valueOf(Double.parseDouble(number));
        var roundHalfUp = value;
        roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.UP);

        var roundHalfDown = value;
        roundHalfDown = roundHalfDown.setScale(scale, RoundingMode.DOWN);

        var roundHalfFloor = value;
        roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.FLOOR);

        System.out.println("Round Half up: " + roundHalfUp);
        System.out.println("Round Half down: " + roundHalfDown);
        System.out.println("Round Half floor: " + roundHalfFloor);
    }
}


/*

        /*
        1. Klasa -> Class
        2. Obiekt -> Object
        3. Zmienna -> Variables
            typy, deklaracja zmiennych

//region Variables

    int wartoscBoolean = 1; //Ta zmienna może przyjmować wartości 0 lub 1



    //Ctrl+ lewy przycisk myszy na 'String'
    String tekst = "";  //-> var string = "" -> string s = ""
    BigDecimal value = BigDecimal.valueOf(1);
    BigDecimal value1 = BigDecimal.ONE;

//endregion

// Program wyświetlający
// w terminalu przykładowy tekst

//        System.out.println("My first Application");
        System.out.println("My first Application");
            System.out.println("Get BigDecimal value:" + value + " valkue1: " + value1);

/*
 Ctrl+/
tekst
tekst
tekst
tekst
tekst
tekst

         */
/*

            int intValue = 4000000;
            int intValueB = intValue + 1000;

            System.out.println(intValue);
            System.out.println(intValue + 100);
            System.out.println(intValueB);


            double doubleValue = 2.0;

            System.out.println(doubleValue);

            char znak = 'a';
            char[] tabZnakow = {'\u0043', 'a'};

            System.out.println("add: " + add(1, 3));
            System.out.println("concat: " + concat("Jan ", "Nowak"));



            System.out.println("\nLiterały i\tznaki specjalne");
            System.out.println("\nLiterały i" + "   " + "znaki specjalne\b");

            System.out.println("\'Literały\' i " + "\"znaki\" specjalne \\"); // to jest konentarz


//        "C:\\Users\\java\\Pulpit\\dockument.txt"


            int intValue5 = 4000000;
            Integer integerValue3 = Integer.valueOf(4000000);
            Integer integerValue2 = Integer.valueOf("4000000");
            Integer integerValue4 = Integer.parseInt("4000000");

            System.out.println("Integer value: " + integerValue3);
            System.out.println("Integer value: " + integerValue2);
            System.out.println("Integer value: " + integerValue4);

            boolean boolValue = false;
            Boolean boolVal = Boolean.FALSE; // Boolean.TRUE
            Boolean boolVal2 = Boolean.valueOf("true");

            System.out.println("Boolean value: " + boolVal);
            System.out.println("Boolean value: " + boolVal2);

            boolean boolValue4;
            if (wartoscBoolean == 1) {
            boolValue4 = true;
            } else {
            boolValue4 = false;
            }
            System.out.println(boolValue4);


            Double cenaDouble = 12.5;
            Long cenaInt = Math.round(cenaDouble);

            System.out.println(cenaInt);
            //zaokrąglanie inny sposób


 */
