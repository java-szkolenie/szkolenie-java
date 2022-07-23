package pl.cyber.trainees.wyjasnienia;

public class Basics {
//Utworzyć metodę, której zadaniem jest wyświetlenie tekstu podanego jako parametr

  public String tekst2 = " "; // to jest parametr klasy, który musi być inicjowany poprzez construktor klasy
  public String tekst3 = " ";
  public String tekst4 = " ";
  public Integer parametrKlasy = 0;


  //konstruktor klasy ma za zadanie ustawiać parametry niezbędę przy tworzeniu ojektu klasy w tym przypadku Basics
  //konstruktor nie posiada zwracanego typu danych, natomiast zawsze ma taką samą nazwę jak nazwa klasy
  //konstruktory możemy przeciążać to znaczy możemy mieć wiele metod typu konstruktor o zmiennej ilości parametrów
  public Basics() { }

  public Basics(final String tekst) {
    //this.tekst2 - poprzez słówko this odwołujemy się do parametru klasy
    //tekst - jest to wykorzystanie parametru z konstruktora
    //inaczej do parametru klasy ustawiana jest wartość z parametru konstruktora
    //tzn parametrKlasy = parametrKonstruktora
    this.tekst2 = tekst;
  }

  public Basics(final String tekst2, String tekst3) {
    this.tekst2 = tekst2;
    this.tekst3 = tekst3;
  }

  public Basics(final String tekst2, String tekst3, String tekst4) {
    this.tekst2 = tekst2;
    this.tekst3 = tekst3;
    this.tekst4 = tekst4;
  }

  public Basics(final Integer parametrKonstruktora) {
    System.out.println(this.parametrKlasy);
    System.out.println(parametrKonstruktora);

    this.parametrKlasy = parametrKonstruktora;

    System.out.println(this.parametrKlasy);
    System.out.println(parametrKonstruktora);
  }

  public void wyswietlTekst1(String tekst) {
//    System.out.println("Wyświetl tekst");
    System.out.println("Wyświetl tekst: " + tekst);
  }

  public void wyswietlTekst2(String tekst) {
    System.out.println(tekst2);
  }

  public void wyswietlTekst3(String tekst) {
    System.out.println(tekst);
    System.out.println(tekst2);
    System.out.println(tekst3);
    System.out.println(tekst4);
  }
}
