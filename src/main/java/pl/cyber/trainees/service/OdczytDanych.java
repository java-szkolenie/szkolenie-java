package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
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

    Model modelPojazdu = new Model();
    Scanner scan = new Scanner(plikZew);
    String liniaWPliku = scan.nextLine();
    String[] tablicaPliku = liniaWPliku.split(", ");

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
