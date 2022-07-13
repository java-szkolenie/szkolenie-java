package pl.cyber.trainees.klkulator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Mariusz Tański
 */

public class Dzielenie {

  public static Integer division(final Integer val, final Integer val2) {
    return val / val2;
  }

  public static Double division(final Double val, final Double val2) {
    return val / val2;
  }

  public static BigDecimal division(final BigDecimal val, final BigDecimal val2) {
    return val.divide(val2, 2, RoundingMode.HALF_DOWN);
  }

  public static Double divisionByZero(final Double val, final Double val2) {
    var zero = Double.valueOf(0);
    if (zero.equals(val2)) {
      System.out.println("Dzialanie przed zero!!!!!");
      return 0.0;
    }
    return val / val2;
  }

  public static BigDecimal divisionByZero(final BigDecimal val, final BigDecimal val2) {
    BigDecimal divide = BigDecimal.ZERO;

    try {
      divide = val.divide(val2, 2, RoundingMode.HALF_DOWN);
    } catch (final ArithmeticException ex) {
      System.out.println("Działanie dzielenia przez zero!!!!!!");
    }
    return divide;
  }
}
