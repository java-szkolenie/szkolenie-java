package pl.cyber.trainees.kalkulator;
import java.math.BigDecimal;

/**
 * @author Mariusz Tański
 */

public class Mnozenie {
  public static Integer multiplication(final Integer val, final Integer val2) { return val * val2; }

  public static Double multiplication(final Double val, final Double val2) { return val * val2; }

  public static BigDecimal multiplication(final BigDecimal val, final BigDecimal val2) { return val.multiply(val2); }
}
