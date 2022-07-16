package pl.cyber.trainees.kalkulator;
import java.math.BigDecimal;

/**
 * @author Mariusz Tański
 */

public class Odejmowanie {


  public static Integer subtract(final Integer val, final Integer val2) { return val - val2; }

  public static Double subtract(final Double val, final Double val2) { return val - val2; }

  public static BigDecimal subtract(final BigDecimal val, final BigDecimal val2) { return val.subtract(val2); }


}
