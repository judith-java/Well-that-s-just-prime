package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Factorizer {

  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();

    if (n == null || n <= 1) {
      return factors;
    }

    int divisor = 2;
    while (n > 1) {
      while (n % divisor == 0) {
        factors.add(divisor);
        n /= divisor;
      }
      divisor++;
    }

    return factors;
  }

  public boolean isPrime(int n) {
    return primeFactors(n).size() == 1;
  }

  public boolean isComposite(int n) {
    return n > 1 && !isPrime(n);
  }

  public String reduce(int numerator, int denominator) {
    if (denominator == 0) {
      return "undefined"; // Cannot divide by zero
    }

    if (numerator == 0) {
      return "0"; // 0 over anything is 0
    }

    // Get prime factors
    ArrayList<Integer> numFactors = primeFactors(Math.abs(numerator));
    ArrayList<Integer> denFactors = primeFactors(Math.abs(denominator));

    // Count occurrences of each factor
    HashMap<Integer, Integer> numCount = getFactorCount(numFactors);
    HashMap<Integer, Integer> denCount = getFactorCount(denFactors);

    // Cancel common factors
    for (Integer factor : new ArrayList<>(numCount.keySet())) {
      if (denCount.containsKey(factor)) {
        int minCount = Math.min(numCount.get(factor), denCount.get(factor));
        numCount.put(factor, numCount.get(factor) - minCount);
        denCount.put(factor, denCount.get(factor) - minCount);
      }
    }

    int reducedNum = multiplyFactors(numCount);
    int reducedDen = multiplyFactors(denCount);

    // Determine sign
    boolean isNegative = (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0);
    if (isNegative) {
      reducedNum = -reducedNum;
    }

    if (reducedDen == 1) {
      return String.valueOf(reducedNum);
    } else {
      return reducedNum + "/" + reducedDen;
    }
  }

  private HashMap<Integer, Integer> getFactorCount(ArrayList<Integer> factors) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int f : factors) {
      countMap.put(f, countMap.getOrDefault(f, 0) + 1);
    }
    return countMap;
  }

  private int multiplyFactors(HashMap<Integer, Integer> countMap) {
    int result = 1;
    for (Integer factor : countMap.keySet()) {
      int count = countMap.get(factor);
      for (int i = 0; i < count; i++) {
        result *= factor;
      }
    }
    return result;
  }
}
