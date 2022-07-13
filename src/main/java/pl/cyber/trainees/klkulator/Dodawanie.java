package pl.cyber.trainees.klkulator;

import java.math.BigDecimal;

/**
 * @author Mariusz Tański
 */

public class Dodawanie {

  //4 metody ba dodawanie String, Int, Double, BigDecimal

  // następne należy 'wstrzynąć' nowe klasy do klasy SimpleApp i prawidłowo ich użyć

  public static int add(int l1, int l2) {
    var result = l1 + l2;
    return result;

//        return l1 + l2;
  }

  public static String add(final String val, final String val2) {
    var result = val + val2 + "\n";
    return result;
  }
  public static Integer add(final Integer val, final Integer val2) {
    return val + val2;
  }

  public static Double add(final Double val, final Double val2) { return val + val2; }

  public static BigDecimal add(final BigDecimal val, final BigDecimal val2) { return val.add(val2); }

}
