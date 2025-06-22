package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println("Factors of 0: " + factorizer.primeFactors(0)); 
    System.out.println("Factors of 1: " + factorizer.primeFactors(1)); 
    System.out.println("Factors of 9: " + factorizer.primeFactors(9));  
    System.out.println("Factors of 10: " + factorizer.primeFactors(10)); 
    System.out.println("Factors of 24: " + factorizer.primeFactors(24)); 
    System.out.println("Factors of 17: " + factorizer.primeFactors(17)); 
  }
}
