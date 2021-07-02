import java.util.*;

public class lecture3 {
  // public static int square(int x,int y){
  // int ans = x*x;
  // return ans;
  // }
  public static int square(int x) {
    int ans = x * x;
    return ans;
  }

  public static int reverse(int num) {
    int ans = 0;
    while (num != 0) {
      ans = ans * 10 + num % 10;
      num = num / 10;
    }
    return ans;
  }

  public static int numberOfDigits(int n) {
    int count = 0;
    while (n != 0) {
      count++;
      n = n / 10;
    }
    return count;
  }

  public static int power(int k) {
    int ans = 1;
    for (int i = 1; i <= k; i++) {
      ans = ans * 10;
    }
    return ans;
  }

  public static int rotateByK(int n, int k) {
    int digits = numberOfDigits(n);
    k = k % digits;
    if (k < 0) {
      k = k + digits;
    }
    int p = (int) Math.pow(10, k);
    int ans = n % p * (int) Math.pow(10, digits - k) + n / p;
    return ans;
  }

  public static void pattern1(int n) {
    int id = 1, nst = 1;
    while (id <= n) {
      int cst = 1;
      while (cst <= nst) {
        System.out.print("*");
        cst++;
      }
      System.out.println();
      nst = nst + 1;
      id = id + 1;
    }
  }

  public static void pattern2(int n) {
    int id = 1, nst = 1;
    while (id <= n) {
      int cst = 1;
      while (cst <= nst) {
        System.out.print(cst);
        cst++;
      }
      System.out.println();
      nst = nst + 1;
      id = id + 1;
    }
  }

  public static void pattern3(int n) {
    int id = 1, nst = 1, nsp = n - 1;
    while (id <= n) {
      int csp = 1;
      while (csp <= nsp) {
        System.out.print(" ");
        csp++;
      }
      int cst = 1;
      while (cst <= nst) {
        System.out.print("*");
        cst++;
      }
      System.out.println();
      nst = nst + 1;
      nsp = nsp - 1;
      id = id + 1;
    }
  }

  public static void pattern4(int n) {
    int id = 1, nst = 1, nsp = n - 1;
    while (id <= n) {
      int csp = 1;
      while (csp <= nsp) {
        System.out.print(" ");
        csp++;
      }
      int cst = 1;
      while (cst <= nst) {
        System.out.print("*");
        cst++;
      }
      System.out.println();
      nst = nst + 2;
      nsp = nsp - 1;
      id = id + 1;
    }
  }

  public static void pattern5(int n) {
    int id = 1, nst = 1, nsp = n - 1;
    while (id <= n) {
      int csp = 1;
      while (csp <= nsp) {
        System.out.print(" ");
        csp++;
      }
      int cst = 1;
      while (cst <= nst) {
        System.out.print(cst);
        cst++;
      }
      System.out.println();
      nst = nst + 2;
      nsp = nsp - 1;
      id = id + 1;
    }
  }

  public static void pattern6(int n) {
    int id = 1, nst = 1, nsp = n - 1;
    while (id <= 2*n-1) {
      int csp = 1;
      while (csp <= nsp) {
        System.out.print(" ");
        csp++;
      }
      int cst = 1;
      while (cst <= nst) {
        System.out.print("*");
        cst++;
      }
      System.out.println();
      if (id < n) {
        nst = nst + 2;
        nsp = nsp - 1;
      }
      else{
        nst = nst - 2;
        nsp = nsp + 1;
      }
      id = id + 1;
    }
  }

  public static void pattern() {
    // pattern1(5);
    // pattern2(5);
    // pattern3(5);
    // pattern4(5);
    // pattern5(5);
    pattern6(5);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int ans = square(5);
    // System.out.println(square(5));

    // int n=78688676;
    // System.out.println(reverse(n));

    // int n=8867455,k=-6;
    // System.out.println(rotateByK(n,k));

    pattern();

  }
}
