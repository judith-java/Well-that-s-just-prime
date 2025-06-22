package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {

  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(1));
  }

  @Test
  void itReturnsFactorsForCompositeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(3, 3), factorizer.primeFactors(9));
  }

  @Test
  void itReturnsFactorsForAnotherCompositeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 5), factorizer.primeFactors(10));
  }

  @Test
  void itReturnsSinglePrimeForPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(17), factorizer.primeFactors(17));
  }
}
