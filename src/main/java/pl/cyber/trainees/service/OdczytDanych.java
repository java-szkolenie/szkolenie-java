package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mariusz Tański
 */

public class OdczytDanych {

  public String wprowadzonaWartoscZKlawiatury() {
    // Scanner -- obiekt pozwalający na odczyt danych z klawiatury
    //System.in - obiekt reprezentujący InputStream, odpowiada z przetwarzanie danych
    Scanner scan = new Scanner(System.in);

    return scan.nextLine();
  }

  public Integer wprowadzonyIntegerZKlawiatury() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Podaj liczbę typu Integer:");
    return scan.nextInt();
  }

  public BigDecimal wprowadzonyBigDecimalZKlawiatury() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Podaj liczbę typu BigDecimal:");
    return scan.nextBigDecimal();
  }

  //public String daneZPliku(File plikZew) throws FileNotFoundException
  //throws mówi aplikacji (ewentualnie) pojawiający
  // się błąd przenieść do miejsca wykonania metody


  //Obsłużenie wyjątków
  public String daneZPliku(File plikZew) throws FileNotFoundException
  {
    Scanner scan = new Scanner(plikZew);
    return scan.nextLine();
  }

  public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException
  {
    // string[] <-
    //String[] <-

    //różnica między tablicą a Listą
    //lista.get(n)
    //tab[n]

    Scanner scan = new Scanner(plikZew);
    return getModelPojazduZPliku(scan.nextLine());
  }

  public List<Model> daneOModelachPojazdow(File plikZew) throws FileNotFoundException
  {
    List<Model> modelePojazdu = new ArrayList<>();
    Scanner scan = new Scanner(plikZew);

    while(scan.hasNext()) {
      modelePojazdu.add(getModelPojazduZPliku(scan.nextLine()));
    }

    return modelePojazdu;
  }

  private Model getModelPojazduZPliku(String liniaZPliku) {
    Model modelPojazdu = new Model();

    String[] tablicaPliku = liniaZPliku.split(", ");

    modelPojazdu.setMarka(tablicaPliku[0]);
    modelPojazdu.setRocznik(tablicaPliku[1]);
    modelPojazdu.setNaped(tablicaPliku[2]);
    modelPojazdu.setNazwa(tablicaPliku[3]);
    modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
    modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
    modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

    return modelPojazdu;
  }
}
