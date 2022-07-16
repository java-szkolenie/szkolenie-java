package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mariusz Tański
 */

public class Petle {

  //Zadanie utworzyć metodę, która wyświetli liczby całkowite od 1 do 100 po przecinku.
  //oraz prawidłowo użyć w SimpleApp.java

  public void wyswietlOd1Do100() {

//    for (int i = 0; i < 100; i++) {
//      System.out.print(i + 1);
//      System.out.print(", ");
//    }

    for (int i = 1; i <= 100; i++) {
      if(i < 100) {
        System.out.print(i + ", ");
      } else {
        System.out.print(i + ".");
      }
    }

    System.out.println();
  }

//  Utworzyć nową metodę w której przekażemy jako parametr Listę Double. W ramach pętli foreach wykonamy dodawanie wartości z listy
// następnie proszę wyświetlić wynik dodawania w postaci: Wynik dodawania listy: XZY
// XZY - wynik dodawania
// w tamach pl.cyber.trainees powinien pojawić się kalkulator który będzie niezbędny do wykonania zadania

  public void dodawanieElementowListy(List<Double> lista) {

    Double result = 0.0;

    for (Double element : lista) {
      System.out.println("Teraz wykonuję operację: " + element + " + " + result);
      result = Dodawanie.add(result, element);
//      result = result + element;
    }

    System.out.println("Wynik dodawania listy: " + result);



  }

  //Set.of() można ustawiać kolekcję Set, należy pamiętać, że maksymalnie przyjmuje 10 elementów
  //Użycie Set.of() stosowane jest dla kolekcji o małej liczbie elementów, głównie w ramach testów jednostkowych.


  //Utworzenie metody, która wyświetli zadany set
  // Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
  // następnie przez pętlę foreach wyświetlić elementy.
  // Wyświetlenie w następujący sposób: To jest element seta:

  public void wyswietlSet(){

//    Integer nazwaZmiennej = 0;   ->  Typ nazwaZmiennej = (przypisane wartości) 0(wartość)
//    List<Double> lista = new ArrayList<>()    ->
/*
List, Set, Map  - interface kolekcji


List <- interface mechanizmu.   Interface - zbiór dostępnych metod do wykonania
<Typ> <- deklaracja przechowywanego typu. Jest możliwe String, BigDecmial, Double, Model, Pojazd, etc.
nie można podawać metod ani klas
lista <- nazwaZmiennej

= - deklaracja wartości
new - opisane w słowniku-pojęć
ArrayList<>() - wybór konkretnej implementacji interface'u List

 */
    Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

    for (Integer element :
        intSet) {
      System.out.println("To jest element seta: " + element);
    }
  }
}
