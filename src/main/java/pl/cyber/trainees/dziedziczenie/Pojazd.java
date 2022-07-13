package pl.cyber.trainees.dziedziczenie;

/**
 * @author Mariusz Tański
 */

//Nowa klasa określająca markę pojazdu
public class Pojazd {

  private final String marka;
  private final String rocznik;
  private final String naped;

  public Pojazd() {
    marka = "";
    rocznik = "";
    naped = "";
  }

  //Alt + Fn +
  //Cmd + n -< systemy MacOs
  //Alt + Insert - menu kontekstowe do generowania kodu, wybieramy opcję Constructor
  public Pojazd(final String marka, final String rocznik, final String naped) {
    this.marka = marka;
    this.rocznik = rocznik;
    this.naped = naped;
  }

  public String toString(){
    return "Marka: " + this.marka
        + " rocznik: " + this.rocznik
        + " napęd: " + this.naped;
  }

  //Gettery - metody, któych zadaniem jest pobieranie informacji z pól klasy
  // do dalszego przetwarzania
  public String getMarka() {
    return marka;
  }

  public String getRocznik() {
    return rocznik;
  }

  public String getNaped() {
    return naped;
  }
}
