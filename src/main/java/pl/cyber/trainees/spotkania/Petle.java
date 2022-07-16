package pl.cyber.trainees.spotkania;

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
  }

//  Utworzyć nową metodę w której przekażemy jako parametr Listę Double. W ramach pętli foreach wykonamy dodawanie wartości z listy
// następnie proszę wyświetlić wynik dodawania w postaci: Wynik dodawania listy: XZY
// XZY - wynik dodawania

  // w tamach pl.cyber.trainees powinien pojawić się kalkulator który będzie niezbędny do wykonania zadania

}
