// Challenge Sixteen:
// Challenge Source:

public class Triangular {
    public static long triangular(long n) {
      if (n < 1) {
        return 0;
      } else {
        return n * (n + 1) / 2;
      }
    }

    public static void main(String[] args) {
        System.out.println(Triangular.triangular(0));
        System.out.println(Triangular.triangular(2));
        System.out.println(Triangular.triangular(3));
        System.out.println(Triangular.triangular(-10));
    }
}