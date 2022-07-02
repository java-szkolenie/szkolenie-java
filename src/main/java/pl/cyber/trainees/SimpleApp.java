package pl.cyber.trainees;

import java.math.BigDecimal;

public class SimpleApp {

    enum Stan {on, off};
    enum Plec {kobieta, mezczyzna};
    public static void main(String[] args) {

//praca domowa
        //Utworzenie 2 zmiennych typu String i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Integer i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Double i ich inicjalizacja

        //dodawanie , odejmowanie, monożenie i dzielenie.
        //proszę o wykonanie działania dzielenie przez 0

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
