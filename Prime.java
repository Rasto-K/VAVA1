package sk.fiit;

public class Prime {

    private int findPrime(int n) {
        if (n <= 1)
            return 0;

        else if (n == 2)
            return n;

        else if (n % 2 == 0)
            return 0;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return 0;
        }
        return n;
    }

    protected void countPrime(int count) {
        for (int i = 1; i < count; i++) {
            if (findPrime(i) != 0)
                System.out.print(i + " ");
        }
    }
}
