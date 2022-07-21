package pl.cyber.trainees.homeworks;

import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.kalkulator.Dodawanie;
import pl.cyber.trainees.kalkulator.Dzielenie;
import pl.cyber.trainees.kalkulator.Mnozenie;
import pl.cyber.trainees.service.OdczytDanych;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mariusz Tański
 */

public class PracaDomowa28Tydz {

  private static final BigDecimal DIVIDE_VAL = BigDecimal.valueOf(2);

  //region rozwiązanie zadania nr 1
  /**
   * 1) do wykonanaia zadanie, które polega na pobraniu od użytkownika informacji wprowadzonych z klawiatury.
   *     a) 5 razy Integer
   *     b) 5 razy BigDecimal
   *   dla każdej opcji powyżej wykonać dodawanie wprowadzonych liczb, mnożenie przez 10 każdej z liczb oraz dzielenie przez 2 każdej z liczb
   *   Wyniki zaprezentować w postaci:
   *   Dodawanie liczb [a, b, c, d, e]: w
   *   Mnożenie przez 10 liczb:
   *   a*10: w
   *   b*10: w
   *   c*10: w
   *   d*10: w
   *   e*10: w
   *
   *   etc.
   */
  public void rozwiazanieZadaniaNr1() {

    OdczytDanych odczytDanych = new OdczytDanych();
    Integer val1 = odczytDanych.wprowadzonyIntegerZKlawiatury();
    Integer val2 = odczytDanych.wprowadzonyIntegerZKlawiatury();
    Integer val3 = odczytDanych.wprowadzonyIntegerZKlawiatury();
    Integer val4 = odczytDanych.wprowadzonyIntegerZKlawiatury();
    Integer val5 = odczytDanych.wprowadzonyIntegerZKlawiatury();

    BigDecimal bdVal1 = odczytDanych.wprowadzonyBigDecimalZKlawiatury();
    BigDecimal bdVal2 = odczytDanych.wprowadzonyBigDecimalZKlawiatury();
    BigDecimal bdVal3 = odczytDanych.wprowadzonyBigDecimalZKlawiatury();
    BigDecimal bdVal4 = odczytDanych.wprowadzonyBigDecimalZKlawiatury();
    BigDecimal bdVal5 = odczytDanych.wprowadzonyBigDecimalZKlawiatury();

    System.out.println("działania dla Integer:");
    System.out.println("Dodawanie liczb [a, b, c, d, e]: " + (
        Dodawanie.add(
            Dodawanie.add(val1, val2),
            Dodawanie.add(
                Dodawanie.add(val3, val4),
                val5
            )
        )));
    System.out.println("Mnożenie liczb a*10: " + (Mnozenie.multiplication(val1,10))
        +"\n"
        + "b*10: "+ (Mnozenie.multiplication(val2,10))
        +"\n"
            + "c*10: "+ (Mnozenie.multiplication(val3,10))
        +"\n"
            + "d*10: "+ (Mnozenie.multiplication(val4,10))
        +"\n"
            + "e*10: "+ (Mnozenie.multiplication(val5,10)));

    System.out.println("Dzielenie liczb a/2: " + (Dzielenie.division(val1,2))
        +"\n"
        + "b/2: "+ (Dzielenie.division(val2,2))
        +"\n"
        + "c/2: "+ (Dzielenie.division(val3,2))
        +"\n"
        + "d/2: "+ (Dzielenie.division(val4,2))
        +"\n"
        + "e/2: "+ (Dzielenie.division(val5,2)));


    System.out.println("działania dla BigDecimal:");
    System.out.println("Dodawanie liczb [a, b, c, d, e]: " + (
        Dodawanie.add(
            Dodawanie.add(val1, val2),
            Dodawanie.add(
                Dodawanie.add(val3, val4),
                val5
            )
        )));
    System.out.println("Mnożenie liczb a*10: " + (Mnozenie.multiplication(bdVal1,BigDecimal.TEN))
        +"\n"
        + "b*10: "+ (Mnozenie.multiplication(bdVal2,BigDecimal.TEN))
        +"\n"
        + "c*10: "+ (Mnozenie.multiplication(bdVal3,BigDecimal.TEN))
        +"\n"
        + "d*10: "+ (Mnozenie.multiplication(bdVal4,BigDecimal.TEN))
        +"\n"
        + "e*10: "+ (Mnozenie.multiplication(bdVal5,BigDecimal.TEN)));

    System.out.println("Dzielenie liczb a/2: " + (Dzielenie.division(bdVal1,DIVIDE_VAL))
      +"\n"
      + "b/2: "+ (Dzielenie.division(bdVal2,DIVIDE_VAL))
      +"\n"
      + "c/2: "+ (Dzielenie.division(bdVal3,DIVIDE_VAL))
      +"\n"
      + "d/2: "+ (Dzielenie.division(bdVal4,DIVIDE_VAL))
      +"\n"
      + "e/2: "+ (Dzielenie.division(bdVal5,DIVIDE_VAL)));

  }

  //endregion

  //region rozwiązanie zadania nr 1 - alternatywa
  public void rozwiazanieZadaniaNr1Alternatywa() {

    OdczytDanych odczytDanych = new OdczytDanych();

    List<String> strings = List.of("a", "b", "c", "d", "e");
    List<Integer> integerList = new ArrayList<>();
    List<BigDecimal> decimalList = new ArrayList<>();


    for (int i=0; i<5; i++) {
      integerList.add(odczytDanych.wprowadzonyIntegerZKlawiatury());
    }

    for (int i=0; i<5; i++) {
      decimalList.add(odczytDanych.wprowadzonyBigDecimalZKlawiatury());
    }

    Integer sumaInt = 0;
    BigDecimal sumaBD = BigDecimal.ZERO;

    for (Integer element :
        integerList) {
      sumaInt = Dodawanie.add(sumaInt, element);
    }

    for (BigDecimal element :
        decimalList) {
      sumaBD = Dodawanie.add(sumaBD, element);
    }


    System.out.println("działania dla Integer:");
    System.out.println("Dodawanie liczb [a, b, c, d, e]: " + sumaInt);

    System.out.println("Mnożenie liczb ");
    for (int i =0; i<integerList.size(); i++){
      System.out.println(strings.get(i) + "*10 : " + (Mnozenie.multiplication(integerList.get(i), 10)));
    }

    System.out.println("Dzielenie liczb ");
    for (int i =0; i<integerList.size(); i++){
      System.out.println(strings.get(i) + "/2 : " + (Dzielenie.division(integerList.get(i), 10)));
    }


    System.out.println("działania dla BigDecimal:");
    System.out.println("Dodawanie liczb [a, b, c, d, e]: " + sumaBD);

    System.out.println("Mnożenie liczb ");
    for (int i =0; i<decimalList.size(); i++){
      System.out.println(strings.get(i) + "*10 : " + (Mnozenie.multiplication(decimalList.get(i), BigDecimal.TEN)));
    }

    System.out.println("Dzielenie liczb ");
    for (int i =0; i<integerList.size(); i++){
      System.out.println(strings.get(i) + "/2 : " + (Dzielenie.division(decimalList.get(i), DIVIDE_VAL)));
    }

  }
  //endregion

  //region Rozwiazanie zadania nr 2

  /**
   * Utworzyć  w 'resources' podkatalog o nazwie 'samochody'
   * Następnie utworzyć 3 pliki: samochod1, samochod2, samochod3
   * w każdym pliku utworzyć strukturę pojazdu w oparciu o klasę 'Model'
   * Każdy plik należy zainicjalizować do nowego obiektu
   *
   *
   * Następnie wyświetlić następujące informacje:
   * Pojazd nr 1: w
   * Pojazd nr 2: w
   * Pojazd nr 3: w
   *
   * Laczna ilosc przejechanych kilometrow przez samochody: w
   * Dostepne pojemosci silnikow samochodow: x, y, z
   *
   * Do wykonania zadania nalezy wykorzystać zdobytą wiedzę z odbytych zajęć
   */

  public void rozwiazanieZadaniaNr2() throws FileNotFoundException {

    OdczytDanych odczytDanych = new OdczytDanych();

    var samochod1 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod1.txt"));
    var samochod2 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod2.txt"));
    var samochod3 = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/samochody/samochod3.txt"));

    System.out.println("Pojazd nr 1: " + samochod1.toString());
    System.out.println("Pojazd nr 2: " + samochod2.toString());
    System.out.println("Pojazd nr 3: " + samochod3.toString());

    System.out.println("Łączna ilość przejechanych km przez samochody: " + (samochod1.getPrzebieg() + samochod2.getPrzebieg() + samochod3.getPrzebieg()));

    System.out.println("Dostepne pojemosci silnikow samochodow: "
        + samochod1.getPojemnoscSilnika()
        + ", "
        + samochod2.getPojemnoscSilnika()
        + ", "
        + samochod3.getPojemnoscSilnika());
  }


  //endregion

  //region Rozwiazanie zadania nr 2 - dla chętnych

  /**
   * Dla chętnych:
   * Spróbować wykonać odczyt dancyh z zadania nr2 z jednego pliku zamiast trzech różnych
   * (tip: aby wykonać to zadanie będzie konieczna nowa metoda odczytująca informacje z plików oraz użycie pętli for)
   */

  public void rozwiazanieZadaniaNr2DlaChetnych() throws FileNotFoundException {

    OdczytDanych odczytDanych = new OdczytDanych();

    var samochod = odczytDanych.daneOModelachPojazdow(new File("src/main/resources/samochody/pojazdy.txt"));


    int licznik = 1;
    for (Model element : samochod) {
      System.out.println("Pojazd nr " + licznik + ": " + element);
      licznik++;
    }

    System.out.println("Łączna ilość przejechanych km przez samochody: " + (samochod.stream().map(Model::getPrzebieg).mapToInt(value -> value).sum()));

    System.out.print("Dostepne pojemosci silnikow samochodow: ");

    for (int i = 0; i<samochod.size(); i++) {
      if(i<samochod.size()) {
        System.out.print(samochod.get(i).getPojemnoscSilnika() + ", ");
      } else {
        System.out.print(samochod.get(i).getPojemnoscSilnika() + ".");
      }
    }
  }
  //endregion
}
