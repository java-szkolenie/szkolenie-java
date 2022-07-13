package pl.cyber.trainees.dziedziczenie;

/**
 * @author Mariusz Tański
 */
//extends - słowo kluczowe stosowane przy dziedziczeniu klas
//super - słowo kluczowe stosowane przy dziedziczeniu odnosi się do konstruktora klasy nadrzędnej
public class Model extends Pojazd {

  private final String nazwa;
  private final Integer przebieg;
  private final Double pojemnoscSilnika;
  private final Kolor kolor;

  public Model() {
    super();
    this.nazwa = "";
    this.przebieg = 0;
    this.pojemnoscSilnika = 0.0;
    this.kolor = null;
  }

  public Model(
      final String marka, final String rocznik,
      final String naped, final String nazwa,
      final Integer przebieg,
      final Double pojemnoscSilnika,
      final Kolor kolor) {

    super(marka, rocznik, naped);
    this.nazwa = nazwa;
    this.przebieg = przebieg;
    this.pojemnoscSilnika = pojemnoscSilnika;
    this.kolor = kolor;
  }

  //Ctrl + W - zaznacznie wyrazu pod kursorem
  //Naciśnięcie rolki myszy i przeciągnięcie w górę/dół pozwala na zaznaczenie
                //więcel linii niż tylko jednej

  @Override //adnotacja wykorzystywana do przysłaniania metod
  public String toString() {
    return "Marka: " + getMarka()
        + " rocznik: " + getRocznik()
        + " napęd: " + getNaped()
        + " nazwa modelu: " + this.nazwa
        + " przebieg: " + this.przebieg
        + " pojemnoscSilnika: " + this.pojemnoscSilnika
        + " kolor: " + this.kolor;
  }

  public String getNazwa() {
    return nazwa;
  }

  public Integer getPrzebieg() {
    return przebieg;
  }

  public Double getPojemnoscSilnika() {
    return pojemnoscSilnika;
  }

  public Kolor getKolor() {
    return kolor;
  }
}
