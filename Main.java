class Main {
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  public static boolean isPrime(int n) {
    int[] prime = new int[n + 1];
    
    for(int i = 3; i <= n; i += 2) {
      prime[i] = 1;
    }

    for (int i = 3; i <= n; i += 2) {
      if (prime[i] == 1) {
        for (int j = i * i; j <= n; j += i * 2) {
          prime[j] = 0;
        }
      }
    }

    prime[0] = 0;
    prime[1] = 0;
    prime[2] = 1;

    return (prime[n] == 1) ? true : false;
  }
}