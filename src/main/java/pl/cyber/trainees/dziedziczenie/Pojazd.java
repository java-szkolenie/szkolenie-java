package pl.cyber.trainees.dziedziczenie;

/**
 * @author Mariusz Tański
 */

//Nowa klasa określająca markę pojazdu
public class Pojazd {

  private String marka;
  private String rocznik;
  private String naped;

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

  //Settery - metody, któych zadaniem jest ustawianie informacji z paratemru metody do parametru klasy
  public void setMarka(final String marka) {
    this.marka = marka;
  }

  public void setRocznik(final String rocznik) {
    this.rocznik = rocznik;
  }

  public void setNaped(final String naped) {
    this.naped = naped;
  }
}
