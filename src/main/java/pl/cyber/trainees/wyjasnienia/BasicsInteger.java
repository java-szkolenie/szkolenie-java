package pl.cyber.trainees.wyjasnienia;

public class BasicsInteger {

  /*
  Warte zapamiętania
  konstrukcja klasy

 public class NazwaKlasy {

 }


 Konstrukcja metody w klasie

  public class NazwaKlasy {

   public void nazwaMetody() {

   }

 }


 Błędne konstrukcje metod: TAK NIE PISAĆ

  public class NazwaKlasy {

     public String metodaA();
      -- brak rozpoczęcia i zakończenia metody przez {}
      i metody nie posiadają ;

     String public metodaB() {
     --najpierw modyfikator następnie zwracany typ danych
     }

     public metodaC() {
 -- brak typu danych
 -- nawias zamykający


      public String metodaD() {
          public String metodaE(){
          }
      }
 }
   */

  /* konstrukcja konkatenacji stringów / stringów z liczbami / stringów z wyrażeniami arytmetycznymi


*/

  //Metoda, która wyświetli liczbę z podanego parametru
  public void wyswietlLiczbe(Integer liczbaDoWyswietlenia) {
    System.out.println(liczbaDoWyswietlenia);
  }

  //Metoda, która wyświetli liczbę z podanego parametru
  //Wprowadzona liczba to:  12314
  public void wyswietlLiczbe2(Integer liczbaDoWyswietlenia) {
    System.out.println("Wprowadzona liczba to: " + liczbaDoWyswietlenia);
  }

  //Utworzyć metodę, która przyjmie 3 parametry, String, Integer, Integer
  //String -> "Wynik dodawania: "
  //Integer -> liczba którą będziemy dodawać

  public void wyswietlenieSumyLiczb(String txt, Integer a, Integer b) {
//    System.out.println(txt + (a+b));
    System.out.println(txt);
    System.out.println(a+b);
  }

  //Utworzyć metodę która zwraca wynik dodawania dwóch Integerów
  //w klasie SimpleApp powinniśmy przekazać ten wynik do metody Basics.wyswietlText(xxx);

  public Integer sumaIntow(Integer a, Integer b) {
    return a+b;
  }
}
