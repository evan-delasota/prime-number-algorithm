class Main {
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  public static boolean isPrime(int n) {
    int[] prime = new int[n + 1];
    for(int i = 3; i <= n; ++i) {
      if (prime[i] % 2 == 0) {
        prime[i] = 0;
      } else {
        prime[i] = 1;
      }
    }

    for (int i = 3; i <= n; ++i) {
      if (prime[i]) {
        for (int j = 2 * i; j <= n; j += i) {
          prime[j] = 0;
        }
      }
    }

    prime[0] = 0;
    prime[1] = 0;
    prime[2] = 0;

    return (prime[n] == 1) ? true : false;
  }
}