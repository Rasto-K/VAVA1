package sk.fiit;

public class Divisor {
    private int findDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;
        return count;
    }

    protected void Sequence(int number) {

        int div, ans = 1;
        System.out.print(1 + " ");
        for (int i = 1; i < number; i++) {
            div = findDivisors(ans);
            ans += div;
            System.out.print(ans + " ");
        }
    }
}
