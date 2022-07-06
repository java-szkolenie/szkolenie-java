package pl.cyber.trainees;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleApp {

    enum Stan {on, off}
    enum Plec {kobieta, mezczyzna}

    public static String SEPARATOR_SPACJA = " ";

    public static void main(String[] args) {

        int scale = 0;

//        String space = " ";
//        String a = "Ala";
//        String b = "ma kota";
//
//
//        System.out.println(a + space + b);
//        System.out.println(a + SEPARATOR_SPACJA + b);


//praca domowa
        //Utworzenie 2 zmiennych typu String i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Integer i ich inicjalizacja
        //Utworzenie 2 zmiennych typu Double i ich inicjalizacja

        //dodawanie , odejmowanie, monożenie i dzielenie.
        //proszę o wykonanie działania dzielenie przez 0



        //region Zaokrąglanie liczb
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
        //endregion

        //region praca domowa
        String valString1 = "pierwszy string";
        String valString2 = new String("drugi string"); // konstrukcja stowosana np czy odczycie informacji z pliku tekstowego zamiast napisu wtedy podaje się jakąś wartośc ze zmiennej

        Integer valInt1 = 2;
        Integer valInt2 = Integer.valueOf("3"); // konstrukcja stosowana przy inicjalizacji poprzez wartości napisowe (inaczej Stringi)

        System.out.println("dodawanie: " + add(valInt1, valInt2) + ", odejmowanie: " + subtract(valInt1, valInt2) + ", mnożenie: " + multiplication(valInt1, valInt2) + ", dzielenie: " + division(valInt1, valInt2));

        Double valDouble1 = 10.5;
        Double valDouble2 = Double.valueOf("4.5");

        System.out.println("dodawanie: " + add(valDouble1, valDouble2) + ", odejmowanie: " + subtract(valDouble1, valDouble2) + ", mnożenie: " + multiplication(valDouble1, valDouble2) + ", dzielenie: " + division(valDouble1, valDouble2));

        BigDecimal valBigDec1 = BigDecimal.valueOf(10.5);
        BigDecimal valBigDec2 = new BigDecimal("4.5");

        System.out.println("dodawanie: " + add(valBigDec1, valBigDec2) + ", odejmowanie: " + subtract(valBigDec1, valBigDec2) + ", mnożenie: " + multiplication(valBigDec1, valBigDec2) + ", dzielenie: " + division(valBigDec1, valBigDec2));

//        Problem dzielenia przez 0

//        System.out.println("Dzielenie przez 0" +  division(valDouble1, 0.0));
//        System.out.println("Dzielenie przez 0" +  division(valBigDec1, BigDecimal.ZERO));

//Rozwiązanie:
        System.out.println("Dzielenie przez 0: " +  divisionByZero(valDouble1, 0.0));
        System.out.println("Dzielenie przez 0: " +  divisionByZero(valBigDec1, BigDecimal.ZERO));
        //endregion

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

    public static Integer add(final Integer val, final Integer val2) { return val + val2; }
    public static Integer subtract(final Integer val, final Integer val2) { return val - val2; }
    public static Integer multiplication(final Integer val, final Integer val2) { return val * val2; }
    public static Integer division(final Integer val, final Integer val2) { return val / val2; }

    public static Double add(final Double val, final Double val2) { return val + val2; }
    public static Double subtract(final Double val, final Double val2) { return val - val2; }
    public static Double multiplication(final Double val, final Double val2) { return val * val2; }
    public static Double division(final Double val, final Double val2) { return val / val2; }

    public static BigDecimal add(final BigDecimal val, final BigDecimal val2) { return val.add(val2); }
    public static BigDecimal subtract(final BigDecimal val, final BigDecimal val2) { return val.subtract(val2); }
    public static BigDecimal multiplication(final BigDecimal val, final BigDecimal val2) { return val.multiply(val2); }
    public static BigDecimal division(final BigDecimal val, final BigDecimal val2) {
        return val.divide(val2, 2, RoundingMode.HALF_DOWN);
    }

    public static Double divisionByZero(final Double val, final Double val2) {
        var zero = Double.valueOf(0);
        if(zero.equals(val2)) {
            System.out.println("Dzialanie przed zero!!!!!");
            return 0.0;
        }
        return val / val2;
    }

    public static BigDecimal divisionByZero(final BigDecimal val, final BigDecimal val2) {
        BigDecimal divide = BigDecimal.ZERO;

        try {
            divide = val.divide(val2, 2, RoundingMode.HALF_DOWN);
        } catch (final ArithmeticException ex) {
            System.out.println("Działanie dzielenia przez zero!!!!!!");
        }
        return divide;
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
