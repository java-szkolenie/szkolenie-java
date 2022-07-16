package pl.cyber.trainees.kalkulator;


import java.math.BigDecimal;

/**
 * @author Mariusz Tański
 */

public class Calculator {

  private final Dodawanie dodawanie;
  private final Mnozenie mnozenie;
  private final Odejmowanie odejmowanie;
  private final Dzielenie dzielenie;

  public Calculator(final Dodawanie dodawanie, final Mnozenie mnozenie, final Odejmowanie odejmowanie, final Dzielenie dzielenie) {
    this.dodawanie = dodawanie;
    this.mnozenie = mnozenie;
    this.odejmowanie = odejmowanie;
    this.dzielenie = dzielenie;
  }

  public void printData() {
    //region praca domowa
    String valString1 = "pierwszy string";
    String valString2 = new String(
        "drugi string"); // konstrukcja stowosana np czy odczycie informacji z pliku tekstowego zamiast napisu wtedy podaje się jakąś wartośc ze zmiennej

    Integer valInt1 = 2;
    Integer valInt2 = Integer.valueOf("3"); // konstrukcja stosowana przy inicjalizacji poprzez wartości napisowe (inaczej Stringi)

    System.out.println(
        "dodawanie: " + dodawanie.add(valInt1, valInt2) + ", odejmowanie: " + odejmowanie.subtract(valInt1, valInt2) + ", mnożenie: " + mnozenie.multiplication(valInt1,
            valInt2) + ", dzielenie: " + dzielenie.division(valInt1, valInt2));

    Double valDouble1 = 10.5;
    Double valDouble2 = Double.valueOf("4.5");

    //UWAGA! W tym przypadku bardziej preferowane rozwiącanie.
    System.out.println("dodawanie: " + Dodawanie.add(valDouble1, valDouble2) + ", odejmowanie: " + Odejmowanie.subtract(valDouble1, valDouble2) + ", mnożenie: "
        + Mnozenie.multiplication(valDouble1, valDouble2) + ", dzielenie: " + Dzielenie.division(valDouble1, valDouble2));

    BigDecimal valBigDec1 = BigDecimal.valueOf(10.5);
    BigDecimal valBigDec2 = new BigDecimal("4.5");

    System.out.println("dodawanie: " + Dodawanie.add(valBigDec1, valBigDec2) + ", odejmowanie: " + Odejmowanie.subtract(valBigDec1, valBigDec2) + ", mnożenie: "
        + Mnozenie.multiplication(valBigDec1, valBigDec2) + ", dzielenie: " + Dzielenie.division(valBigDec1, valBigDec2));

//        Problem dzielenia przez 0

//        System.out.println("Dzielenie przez 0" +  division(valDouble1, 0.0));
//        System.out.println("Dzielenie przez 0" +  division(valBigDec1, BigDecimal.ZERO));

    //Rozwiązanie:
    System.out.println("Dzielenie przez 0: " + Dzielenie.divisionByZero(valDouble1, 0.0));
    System.out.println("Dzielenie przez 0: " + Dzielenie.divisionByZero(valBigDec1, BigDecimal.ZERO));
    //endregion
  }
}
