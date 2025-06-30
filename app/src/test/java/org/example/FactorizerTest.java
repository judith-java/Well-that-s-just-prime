package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorizerAddOnTest {

  Factorizer factorizer = new Factorizer();

  // isPrime Tests
  @Test void itIdentifiesPrimeNumber() {
    assertTrue(factorizer.isPrime(17));
    assertTrue(factorizer.isPrime(2));
  }

  @Test void itIdentifiesNonPrimeNumbers() {
    assertFalse(factorizer.isPrime(1));
    assertFalse(factorizer.isPrime(0));
    assertFalse(factorizer.isPrime(36));
    assertFalse(factorizer.isPrime(12));
  }

  // isComposite Tests
  @Test void itIdentifiesCompositeNumbers() {
    assertTrue(factorizer.isComposite(36));
    assertTrue(factorizer.isComposite(12));
  }

  @Test void itIdentifiesNonCompositeNumbers() {
    assertFalse(factorizer.isComposite(17)); // Prime
    assertFalse(factorizer.isComposite(1));  // Special case
    assertFalse(factorizer.isComposite(0));  // Special case
  }

  // reduce() Tests
  @Test void itReducesFractionToWholeNumber() {
    assertEquals("3", factorizer.reduce(36, 12));
    assertEquals("1", factorizer.reduce(12, 12));
  }

  @Test void itReducesFractionToSimplestForm() {
    assertEquals("6/7", factorizer.reduce(12, 14));
    assertEquals("12/37", factorizer.reduce(12, 37));
  }

  @Test void itHandlesZeroNumerator() {
    assertEquals("0", factorizer.reduce(0, 5));
  }

  @Test void itHandlesNegativeFractions() {
    assertEquals("-3/5", factorizer.reduce(-9, 15));
    assertEquals("-3/5", factorizer.reduce(9, -15));
    assertEquals("3/5", factorizer.reduce(-9, -15));
  }

  @Test void itHandlesDivisionByZero() {
    assertEquals("undefined", factorizer.reduce(5, 0));
  }
}
