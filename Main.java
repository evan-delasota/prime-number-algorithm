class Main {
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }

    for (int i = 2; i * i <= n; ++i) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}