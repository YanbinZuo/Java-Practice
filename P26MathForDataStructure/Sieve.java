package P26MathForDataStructure;

import java.util.Arrays;

public class Sieve {
  public static void main(String[] args) {
    int n = 40;
    boolean[] primes = new boolean[n+1];
    sieve(n, primes);    
  }

  // Kunal's version
  // false in array means number is prime
  static void sieve(int n, boolean[] primes) {
    for (int i = 2; i*i <= n; i++) {
        if (!primes[i]) {
            for (int j = i*2; j <= n; j+=i) {
                primes[j] = true;
            }
        }
    }

    for (int i = 2; i <= n; i++) {
        if (!primes[i]) {
            System.out.print(i + " ");
        }
    }
}

  // my version
  static void sieve1(int n, boolean[] primes) {
    for (int i = 0; i < primes.length; i++) {
      primes[i] = true;
    }
    primes[0]= false;
    primes[1] = false;

    for (int i = 2; i*i <= n; i++) {
      if(isPrime(i)) {
        int j = i;
        int times = 2;
        while(j * times<=n) {
          primes[j * times] = false;
          times++;
        }
      }
    }

    for (int i = 0; i < primes.length; i++) {
      if(primes[i]) {
        System.out.print(i + " ");
      }
    }
  }

  static boolean isPrime(int n) {
    if(n < 2) return true;

    for (int i = 2; i*i <= n; i++) {
      if(n %i == 0) {
        return false;
      }
    }
    return true;
  }
}
