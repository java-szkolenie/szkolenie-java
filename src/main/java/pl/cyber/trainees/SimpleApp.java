package pl.cyber.trainees;

import java.math.BigDecimal;

public class SimpleApp {

    enum Stan {on, off};
    enum Plec {kobieta, mezczyzna};
    public static void main(String[] args) {

        /*
        1. Klasa -> Class
        2. Obiekt -> Object
        3. Zmienna -> Variables
            typy, deklaracja zmiennych
         */

//region Variables





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

    }

    public static int add(int l1, int l2) {
        var result = l1 + l2;
        return result;

//        return l1 + l2;
    }

    public static String concat(String l1, String l2) {
        var result = l1 + l2;
        return result;
    }
}
