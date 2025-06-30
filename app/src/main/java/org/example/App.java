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

    System.out.println("Is 17 Prime? " + factorizer.isPrime(17));
    System.out.println("Is 36 Composite? " + factorizer.isComposite(36));
    System.out.println("Reduce 12/14: " + factorizer.reduce(12, 14));
    System.out.println("Reduce -9/15: " + factorizer.reduce(-9, 15));
    System.out.println("Reduce 5/0: " + factorizer.reduce(5, 0));
  }
}
